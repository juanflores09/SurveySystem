package Beans;

public class TypeOfAccess {
    
    private int IdTypeOfAccess;
    private String Name;

    public TypeOfAccess() {
    }

    public TypeOfAccess(int IdTypeOfAccess, String Name) {
        this.IdTypeOfAccess = IdTypeOfAccess;
        this.Name = Name;
    }

    public int getIdTypeOfAccess() {
        return IdTypeOfAccess;
    }

    public void setIdTypeOfAccess(int IdTypeOfAccess) {
        this.IdTypeOfAccess = IdTypeOfAccess;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
