package DAO;

import Beans.Enrollment_Details;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnrollmentDetailsDAO {
    
    private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        
        public static Enrollment_Details findEnrollmentInCourse(int idEnrolment, int idStudent) throws Exception{
            String sql = "{call findEnrollmentInCourse (?,?)}";
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idEnrolment);
            ps.setInt(2, idStudent);
            rs = ps.executeQuery();
            Enrollment_Details ed = new Enrollment_Details();
            
            while (rs.next()) {                
                ed.setIdEnrollment_Details(rs.getInt(1));
            }
            return ed;
        }
        
        public static void main(String[] args) throws Exception {
        Enrollment_Details ed1 = findEnrollmentInCourse(2, 1);
            System.out.println(ed1.getIdEnrollment_Details());
    }
}
