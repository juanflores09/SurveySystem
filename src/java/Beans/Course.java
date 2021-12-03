package Beans;

public class Course {
    private int IdCourse;
    private String NameCourse;
    private int Credits;
    private String Picture;

    public Course() {
    }

    public Course(int IdCourse, String NameCourse, int Credits, String Picture) {
        this.IdCourse = IdCourse;
        this.NameCourse = NameCourse;
        this.Credits = Credits;
        this.Picture = Picture;
    }

    public int getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(int IdCourse) {
        this.IdCourse = IdCourse;
    }

    public String getNameCourse() {
        return NameCourse;
    }

    public void setNameCourse(String NameCourse) {
        this.NameCourse = NameCourse;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }
    
    
    
}
