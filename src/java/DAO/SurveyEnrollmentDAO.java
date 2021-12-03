package DAO;

import Beans.Survey_Enrollment;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SurveyEnrollmentDAO {
    
        private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        
       public static void main(String[] args) throws Exception {
           AnswerSurvey(1, 3, (float) 2.5);
            
        }
        public static void AnswerSurvey(int idSurvey, int idEnrollmentDetails, float Score) throws Exception{
            
            String sql = "{call AnswerSurvey(?,?,?)}";
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idSurvey);
            ps.setInt(2, idEnrollmentDetails);
            ps.setFloat(3, Score);
            ps.execute();
        }
        
        public static void UpdateAverageOfUser(int idUser, float average) throws Exception{
            String sql = "Update Survey_User set Average="+average+" where idUser="+idUser;
            cn = Conexion.getConexion();
            ps =cn.prepareStatement(sql);
            ps.executeUpdate();
            
            cn.close();
            ps.close();
        }
        
        public static Survey_Enrollment findAverageOfUser(int idUser) throws Exception{
            String sql = "select*from Survey_User where idUser="+idUser;
            cn = Conexion.getConexion();
            ps =cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Survey_Enrollment su = new Survey_Enrollment();
            while (rs.next()) {                
                //su.setIdSurvey_User(rs.getInt(1));
                //su.setIdSurvey(rs.getInt(2));
                //su.setIdUser(rs.getInt(3));
                //su.setAverage(rs.getFloat(4));
            }
            cn.close();
            ps.close();
            return su;
        }
        
        public static List ResultOfTest() throws Exception{
            String sql = "select*from ResultOfTest";
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Object object;
            while(rs.next()){
                
            }
            return null;
        }
        
        
}
