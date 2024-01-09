'''
Author: gsl
Date: 2024-01-04 15:14:54
LastEditTime: 2024-01-05 14:41:17
FilePath: /workspace/Flask/app/ppc_predict/predict.py
Description: 

Copyright (c) 2024 by gsl, All Rights Reserved. 
'''
from ppc_predict import ppc_bp  
from flask import Flask, request, jsonify
import _pickle as pkl
import numpy as np
from . import data_load 

@ppc_bp.route('/predict', methods=['POST','GET'])
def predict():
    parameters = request.form.to_dict()
    
    X = data_load.load_data(parameters)
    
    # load model 
    y_pred_prob_list = []
    # 设置阈值 应对数据分布不均的问题
    threshold = 0.1
    for i in range(1,6):
        with open(f'../model/ppcs_predict_model/XGBClassifier_{i}.pickle','rb') as f:  
            clf_load = pkl.load(f)  
            y_pred_prob_list.append(clf_load.predict_proba(X)[:,1]+threshold) 
      
    return jsonify({'prediction': str(round(np.mean(y_pred_prob_list),3))})
