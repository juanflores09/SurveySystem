package DAO;

import Beans.Course;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    
        private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        public static List<Course> courses = new ArrayList<>();
        public static Course course;
        
        public static List FindAll() throws Exception{
            String sql = "select*from Course";
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                course = new Course();
                course.setIdCourse(rs.getInt(1));
                course.setNameCourse(rs.getString(2));
                course.setCredits(rs.getInt(3));
                course.setPicture(rs.getString(4));
                courses.add(course);
            }
            return courses;
        }
        
        public static Course findById(int idCourse) throws Exception{
            String sql = "select *from Course where IdCourse="+idCourse;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                course = new Course();
                course.setNameCourse(rs.getString(2));
            }
            cn.close();
            ps.close();
            rs.close();
            return course;
        }
        
        public static List FindCoursesByUser(int idUser, int idCycle) throws Exception{
            
            String sql = "{CALL CoursesOfStudent (?,?)}";
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idUser);
            ps.setInt(2, idCycle);
            rs = ps.executeQuery();
            while(rs.next()){
                course = new Course();
                course.setIdCourse(rs.getInt(1));
                course.setNameCourse(rs.getString(2));
                course.setCredits(rs.getInt(3));
                course.setPicture(rs.getString(4));
                courses.add(course);
            }
            return courses;
        }
        
        public static void main(String[] args) throws Exception {
            List<Course>cs=FindCoursesByUser(1, 16);
            
            for (int i = 0; i <cs.size(); i++) {
                System.out.println(cs.get(i).getPicture());
            }
        }
}
