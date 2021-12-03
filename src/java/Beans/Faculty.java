package Beans;

public class Faculty {
    
    private int IdFaculty;
    private int Name;

    public Faculty() {
    }

    public Faculty(int IdFaculty, int Name) {
        this.IdFaculty = IdFaculty;
        this.Name = Name;
    }

    public int getIdFaculty() {
        return IdFaculty;
    }

    public void setIdFaculty(int IdFaculty) {
        this.IdFaculty = IdFaculty;
    }

    public int getName() {
        return Name;
    }

    public void setName(int Name) {
        this.Name = Name;
    }
    
    
}
