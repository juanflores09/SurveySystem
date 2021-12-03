package Beans;

public class User {
    
    private int IdUser;
    private String LastName;
    private String Name;
    private String Gender;
    private String Code;
    private int School;
    private int Faculty;
    private String Email;
    private String Password;
    private int StartCycle;
    private String Phone;
    private String Department; 
    private String Province;
    private String District;
    private String Address;
    private int TypeOfAccess;
    private int Status;

    public User() {
    }

    public User(int IdUser, String LastName, String Name, String Gender,String Code, int School, int Faculty, String Email, String Password, int StartCycle ,String Phone, String Department, String Province, String District, String Address, int TypeOfAccess, int Status) {
        this.IdUser = IdUser;
        this.LastName = LastName;
        this.Name = Name;
        this.Gender = Gender;
        this.Code = Code;
        this.School = School;
        this.Faculty = Faculty;
        this.Email = Email;
        this.Password = Password;
        this.StartCycle = StartCycle;
        this.Phone = Phone;
        this.Department = Department;
        this.Province = Province;
        this.District = District;
        this.Address = Address;
        this.TypeOfAccess = TypeOfAccess;
        this.Status = Status;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getTypeOfAccess() {
        return TypeOfAccess;
    }

    public void setTypeOfAccess(int TypeOfAccess) {
        this.TypeOfAccess = TypeOfAccess;
    }
    
    

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public int getSchool() {
        return School;
    }

    public void setSchool(int School) {
        this.School = School;
    }

    public int getFaculty() {
        return Faculty;
    }

    public void setFaculty(int Faculty) {
        this.Faculty = Faculty;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public int getStartCycle(){
        return StartCycle;
    }
    
    public void setStartCycle(int StartCycle){
        this.StartCycle = StartCycle;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getTipoAceso() {
        return TypeOfAccess;
    }

    public void setTipoAceso(int TipoAceso) {
        this.TypeOfAccess = TipoAceso;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
    
    
}
