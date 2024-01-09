package med.entity;

public class PPCSelection {
    private String operative_specialty_location;
    private String date;
    private String asa;
    private String minimum_of_MP;
    private String abo_blood_group;
    private String laparoscopic_surgery;
    private String auc_of_CRS;
    private String disseminated_cancer;
    private String gender;
    private String functional_status;
    private String cardiac_functional_grading_NYHA;
    private String longest_stirke_above_mean_value_of_MP;
    private String respiratory_rate;
    private String variance_of_P;
    private String minimum_of_CRS;
    private String longest_stirke_above_mean_value_of_CRS;
    private String longest_stirke_below_mean_value_of_CRS;
    private String longest_stirke_below_mean_value_of_MP;
    private String hypertension_control;
    private String percentage_of_MP_value_exceeding_15_from_the_mean;

    public PPCSelection() {
    }

    @Override
    public String toString() {
        return "PPCSelection{" +
                "operative_specialty_location='" + operative_specialty_location + '\'' +
                ", date='" + date + '\'' +
                ", asa='" + asa + '\'' +
                ", minimum_of_MP='" + minimum_of_MP + '\'' +
                ", abo_blood_group='" + abo_blood_group + '\'' +
                ", laparoscopic_surgery='" + laparoscopic_surgery + '\'' +
                ", auc_of_CRS='" + auc_of_CRS + '\'' +
                ", disseminated_cancer='" + disseminated_cancer + '\'' +
                ", gender='" + gender + '\'' +
                ", functional_status='" + functional_status + '\'' +
                ", cardiac_functional_grading_NYHA='" + cardiac_functional_grading_NYHA + '\'' +
                ", longest_stirke_above_mean_value_of_MP='" + longest_stirke_above_mean_value_of_MP + '\'' +
                ", respiratory_rate='" + respiratory_rate + '\'' +
                ", variance_of_P='" + variance_of_P + '\'' +
                ", minimum_of_CRS='" + minimum_of_CRS + '\'' +
                ", longest_stirke_above_mean_value_of_CRS='" + longest_stirke_above_mean_value_of_CRS + '\'' +
                ", longest_stirke_below_mean_value_of_CRS='" + longest_stirke_below_mean_value_of_CRS + '\'' +
                ", longest_stirke_below_mean_value_of_MP='" + longest_stirke_below_mean_value_of_MP + '\'' +
                ", hypertension_control='" + hypertension_control + '\'' +
                ", percentage_of_MP_value_exceeding_15_from_the_mean='" + percentage_of_MP_value_exceeding_15_from_the_mean + '\'' +
                '}';
    }

    public String getOperative_specialty_location() {
        return operative_specialty_location;
    }

    public void setOperative_specialty_location(String operative_specialty_location) {
        this.operative_specialty_location = operative_specialty_location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAsa() {
        return asa;
    }

    public void setAsa(String asa) {
        this.asa = asa;
    }

    public String getMinimum_of_MP() {
        return minimum_of_MP;
    }

    public void setMinimum_of_MP(String minimum_of_MP) {
        this.minimum_of_MP = minimum_of_MP;
    }

    public String getAbo_blood_group() {
        return abo_blood_group;
    }

    public void setAbo_blood_group(String abo_blood_group) {
        this.abo_blood_group = abo_blood_group;
    }

    public String getLaparoscopic_surgery() {
        return laparoscopic_surgery;
    }

    public void setLaparoscopic_surgery(String laparoscopic_surgery) {
        this.laparoscopic_surgery = laparoscopic_surgery;
    }

    public String getAuc_of_CRS() {
        return auc_of_CRS;
    }

    public void setAuc_of_CRS(String auc_of_CRS) {
        this.auc_of_CRS = auc_of_CRS;
    }

    public String getDisseminated_cancer() {
        return disseminated_cancer;
    }

    public void setDisseminated_cancer(String disseminated_cancer) {
        this.disseminated_cancer = disseminated_cancer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFunctional_status() {
        return functional_status;
    }

    public void setFunctional_status(String functional_status) {
        this.functional_status = functional_status;
    }

    public String getCardiac_functional_grading_NYHA() {
        return cardiac_functional_grading_NYHA;
    }

    public void setCardiac_functional_grading_NYHA(String cardiac_functional_grading_NYHA) {
        this.cardiac_functional_grading_NYHA = cardiac_functional_grading_NYHA;
    }

    public String getLongest_stirke_above_mean_value_of_MP() {
        return longest_stirke_above_mean_value_of_MP;
    }

    public void setLongest_stirke_above_mean_value_of_MP(String longest_stirke_above_mean_value_of_MP) {
        this.longest_stirke_above_mean_value_of_MP = longest_stirke_above_mean_value_of_MP;
    }

    public String getRespiratory_rate() {
        return respiratory_rate;
    }

    public void setRespiratory_rate(String respiratory_rate) {
        this.respiratory_rate = respiratory_rate;
    }

    public String getVariance_of_P() {
        return variance_of_P;
    }

    public void setVariance_of_P(String variance_of_P) {
        this.variance_of_P = variance_of_P;
    }

    public String getMinimum_of_CRS() {
        return minimum_of_CRS;
    }

    public void setMinimum_of_CRS(String minimum_of_CRS) {
        this.minimum_of_CRS = minimum_of_CRS;
    }

    public String getLongest_stirke_above_mean_value_of_CRS() {
        return longest_stirke_above_mean_value_of_CRS;
    }

    public void setLongest_stirke_above_mean_value_of_CRS(String longest_stirke_above_mean_value_of_CRS) {
        this.longest_stirke_above_mean_value_of_CRS = longest_stirke_above_mean_value_of_CRS;
    }

    public String getLongest_stirke_below_mean_value_of_CRS() {
        return longest_stirke_below_mean_value_of_CRS;
    }

    public void setLongest_stirke_below_mean_value_of_CRS(String longest_stirke_below_mean_value_of_CRS) {
        this.longest_stirke_below_mean_value_of_CRS = longest_stirke_below_mean_value_of_CRS;
    }

    public String getLongest_stirke_below_mean_value_of_MP() {
        return longest_stirke_below_mean_value_of_MP;
    }

    public void setLongest_stirke_below_mean_value_of_MP(String longest_stirke_below_mean_value_of_MP) {
        this.longest_stirke_below_mean_value_of_MP = longest_stirke_below_mean_value_of_MP;
    }

    public String getHypertension_control() {
        return hypertension_control;
    }

    public void setHypertension_control(String hypertension_control) {
        this.hypertension_control = hypertension_control;
    }

    public String getPercentage_of_MP_value_exceeding_15_from_the_mean() {
        return percentage_of_MP_value_exceeding_15_from_the_mean;
    }

    public void setPercentage_of_MP_value_exceeding_15_from_the_mean(String percentage_of_MP_value_exceeding_15_from_the_mean) {
        this.percentage_of_MP_value_exceeding_15_from_the_mean = percentage_of_MP_value_exceeding_15_from_the_mean;
    }
}
