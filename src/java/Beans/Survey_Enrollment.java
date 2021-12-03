package Beans;

public class Survey_Enrollment {
    
    private int IdSurvey_Enrollment;
    private int idSurvey;
    private int idEnrollment;
    private float Score;
    private int NumberOfSurveyed;

    public Survey_Enrollment() {
    }

    public Survey_Enrollment(int IdSurvey_Enrollment, int idSurvey, int idEnrollment, float Score, int NumberOfSurveyed) {
        this.IdSurvey_Enrollment = IdSurvey_Enrollment;
        this.idSurvey = idSurvey;
        this.idEnrollment = idEnrollment;
        this.Score = Score;
        this.NumberOfSurveyed =NumberOfSurveyed;
    }

    public int getIdSurvey_Enrollment() {
        return IdSurvey_Enrollment;
    }

    public void setIdSurvey_Enrollment(int IdSurvey_Enrollment) {
        this.IdSurvey_Enrollment = IdSurvey_Enrollment;
    }

    public int getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(int idSurvey) {
        this.idSurvey = idSurvey;
    }

    public int getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(int idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public float getScore() {
        return Score;
    }

    public void setScore(float Score) {
        this.Score = Score;
    }

    public int getNumberOfSurveyed() {
        return NumberOfSurveyed;
    }

    public void setNumberOfSurveyed(int NumberOfSurveyed) {
        this.NumberOfSurveyed = NumberOfSurveyed;
    }
    
    
}
