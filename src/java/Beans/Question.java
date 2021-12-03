package Beans;

public class Question {
    
    private int IdQuestion;
    private String Question;
    private String TypeOfQuestion;
    private int idSurvey;

    public Question() {
    }

    public Question(int IdQuestion, String Question, String TypeOfQuestion,int idSurvey) {
        this.IdQuestion = IdQuestion;
        this.Question = Question;
        this.TypeOfQuestion = TypeOfQuestion;
        this.idSurvey = idSurvey;
    }

    public int getIdQuestion() {
        return IdQuestion;
    }

    public void setIdQuestion(int IdQuestion) {
        this.IdQuestion = IdQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getTypeOfQuestion() {
        return TypeOfQuestion;
    }

    public void setTypeOfQuestion(String TypeOfQuestion) {
        this.TypeOfQuestion = TypeOfQuestion;
    }

    public int getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(int idSurvey) {
        this.idSurvey = idSurvey;
    }
    
    
}
