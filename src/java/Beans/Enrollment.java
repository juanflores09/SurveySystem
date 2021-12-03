package Beans;

public class Enrollment {
    
    private int IdEnrollment;
    private int idCourse;
    private int idTeacher;
    private int idCycle;
    private int NumberOfEnrolled;

    public Enrollment() {
    }

    public Enrollment(int IdEnrollment, int idCourse, int idTeacher, int idCycle, int NumberOfEnrolled) {
        this.IdEnrollment = IdEnrollment;
        this.idCourse = idCourse;
        this.idTeacher = idTeacher;
        this.idCycle = idCycle;
        this.NumberOfEnrolled = NumberOfEnrolled;
    }

    public int getIdEnrollment() {
        return IdEnrollment;
    }

    public void setIdEnrollment(int IdEnrollment) {
        this.IdEnrollment = IdEnrollment;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdCycle() {
        return idCycle;
    }

    public void setIdCycle(int idCycle) {
        this.idCycle = idCycle;
    }

    public int getNumberOfEnrolled() {
        return NumberOfEnrolled;
    }

    public void setNumberOfEnrolled(int NumberOfEnrolled) {
        this.NumberOfEnrolled = NumberOfEnrolled;
    }
    
    
}
