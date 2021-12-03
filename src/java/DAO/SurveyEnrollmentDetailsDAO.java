package DAO;

import Beans.Survey_Enrollment_Details;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SurveyEnrollmentDetailsDAO {

        private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        
        public static Survey_Enrollment_Details findByIdEnrollment(int idEnrollmentDetails) throws Exception{
        
            String sql = "select* from Survey_Enrollment_Details where idEnrollmentDetails ="+idEnrollmentDetails;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Survey_Enrollment_Details sed=new Survey_Enrollment_Details();;
            while(rs.next()){
                sed.setIdSurvey_Enrollment_Details(rs.getInt(1));
                sed.setIdSurvey(rs.getInt(2));
                sed.setIdEnrollmentDetails(rs.getInt(3));
            }
            cn.close();
            rs.close();
            ps.close();
            return sed;
        }
        
        public static void main(String[] args) throws Exception {
        
            Survey_Enrollment_Details se = findByIdEnrollment(1);
            
        
        if(se.getIdSurveyEnrollmentDetails()==0){
            System.out.println("Bienvenido");
        } else{
            System.out.println("Usted ya ha respondido esta encuesta");
        }
    }
    
}
