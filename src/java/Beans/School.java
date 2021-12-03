package Beans;

public class School {
    
    private int IdSchool;
    private String Name;
    private int Faculty;

    public School() {
    }

    
    public School(int IdSchool, String Name, int Faculty) {
        this.IdSchool = IdSchool;
        this.Name = Name;
        this.Faculty = Faculty;
    }

    public int getIdSchool() {
        return IdSchool;
    }

    public void setIdSchool(int IdSchool) {
        this.IdSchool = IdSchool;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getFaculty() {
        return Faculty;
    }

    public void setFaculty(int Faculty) {
        this.Faculty = Faculty;
    }
    
    
}
