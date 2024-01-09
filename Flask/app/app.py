'''
Author: gsl
Date: 2024-01-04 15:06:16
LastEditTime: 2024-01-08 17:25:37
FilePath: /workspace/Flask/app/app.py
Description: main

Copyright (c) 2024 by gsl, All Rights Reserved. 
'''

from factory import create_app
from flask import Flask
from ppc_predict import ppc_bp  

app = create_app()

if __name__ == '__main__':

    # app.run(host='0.0.0.0', port=app.config["PORT"], debug=True)
    app.run(port=app.config["PORT"], debug=True)
