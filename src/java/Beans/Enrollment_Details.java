package Beans;

public class Enrollment_Details {
    
    private int IdEnrollment_Details;
    private int idEnrollment;
    private int idStudent;

    public Enrollment_Details() {
    }

    public Enrollment_Details(int IdEnrollment_Details, int idEnrollment, int idStudent) {
        this.IdEnrollment_Details = IdEnrollment_Details;
        this.idEnrollment = idEnrollment;
        this.idStudent = idStudent;
    }

    public int getIdEnrollment_Details() {
        return IdEnrollment_Details;
    }

    public void setIdEnrollment_Details(int IdEnrollment_Details) {
        this.IdEnrollment_Details = IdEnrollment_Details;
    }

    public int getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(int idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    
    
}
