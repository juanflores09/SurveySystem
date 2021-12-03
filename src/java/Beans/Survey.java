package Beans;

public class Survey {
    
    private int IdSurvey;
    private String Title;
    private String Description;
    private int Status;
    private String StartDate;
    private String EndDate;
    private int NumberOfRespondents;

    public Survey() {
    }

    public Survey(String Title, String Description, int Status, String StartDate, String EndDate, int NumberOfRespondents) {
        this.Title = Title;
        this.Description = Description;
        this.Status = Status;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.NumberOfRespondents =NumberOfRespondents;
    }

    public int getIdSurvey() {
        return IdSurvey;
    }

    public void setIdSurvey(int IdSurvey) {
        this.IdSurvey = IdSurvey;
    }
    

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public int getNumberOfRespondents() {
        return NumberOfRespondents;
    }

    public void setNumberOfRespondents(int NumberOfRespondents) {
        this.NumberOfRespondents = NumberOfRespondents;
    }
    
    
    
}
