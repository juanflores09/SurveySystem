package Beans;

public class Survey_Enrollment_Details {
    
    private int IdSurveyEnrollmentDetails;
    private int idSurvey;
    private int idEnrollmentDetails;

    public Survey_Enrollment_Details() {
    }

    public Survey_Enrollment_Details(int IdSurveyEnrollmentDetails, int idSurvey, int idEnrollmentDetails) {
        this.IdSurveyEnrollmentDetails = IdSurveyEnrollmentDetails;
        this.idSurvey = idSurvey;
        this.idEnrollmentDetails = idEnrollmentDetails;
    }

    public int getIdSurveyEnrollmentDetails() {
        return IdSurveyEnrollmentDetails;
    }

    public void setIdSurvey_Enrollment_Details(int IdSurveyEnrollmentDetails) {
        this.IdSurveyEnrollmentDetails = IdSurveyEnrollmentDetails;
    }

    public int getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(int idSurvey) {
        this.idSurvey = idSurvey;
    }

    public int getIdEnrollmentDetails() {
        return idEnrollmentDetails;
    }

    public void setIdEnrollmentDetails(int idEnrollmentDetails) {
        this.idEnrollmentDetails = idEnrollmentDetails;
    }
    
    
}
