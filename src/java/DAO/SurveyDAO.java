package DAO;

import Beans.Survey;
import config.Conexion;
import config.Fecha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SurveyDAO {
    
        private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        public static List<Survey> surveys = new ArrayList<>();
        
        public static Survey findById(int id) throws Exception{
            String sql = "select*from Survey where IdSurvey="+id;
            
            cn= Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Survey survey = new Survey();
            while (rs.next()) {                
                survey.setIdSurvey(rs.getInt(1));
                survey.setTitle(rs.getString(2));
                survey.setDescription(rs.getString(3));
                survey.setStatus(rs.getInt(4));
                survey.setStartDate(rs.getString(5));
                survey.setEndDate(rs.getString(6));
                survey.setNumberOfRespondents(rs.getInt(7));
            }
            cn.close();
            ps.close();
            rs.close();
            return survey;
        }
        
        
        public static void main(String[] args) throws Exception {
            Survey survey = findById(1);
            System.out.println(survey.getNumberOfRespondents());
        }
        
        public static void UpdateNumberOfRespondents(int numberOfRespondents, int idSurvey) throws Exception{
            String sql = "Update Survey set NumberOfRespondents="+numberOfRespondents+" where IdSurvey="+idSurvey;
            cn = Conexion.getConexion();
            ps =cn.prepareStatement(sql);
            ps.executeUpdate();
            cn.close();
            ps.close();
        }
        public static List findAllSurvey() throws Exception{
            String sql = "select*from Survey";
            Survey survey;
            try {
                cn= Conexion.getConexion();
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
            
            while (rs.next()) { 
                survey = new Survey();
                survey.setIdSurvey(rs.getInt(1));
                survey.setTitle(rs.getString(2));
                survey.setDescription(rs.getString(3));
                survey.setStatus(rs.getInt(4));
                survey.setStartDate(rs.getString(5));
                survey.setEndDate(rs.getString(6));
                surveys.add(survey);
            }
            rs.close();
            ps.close();
            cn.close();
            
            } catch (Exception e) {
            }
            return surveys;
        }
        
        public static void AddSurvey(Survey survey) throws Exception{
            String sql = "insert into Survey values(?,?,?,?,?,?)";
            cn = Conexion.getConexion();
            ps=cn.prepareStatement(sql);
            ps.setString(1, survey.getTitle());
            ps.setString(2, survey.getDescription());
            ps.setInt(3, survey.getStatus());
            ps.setString(4, survey.getStartDate());
            ps.setString(5, survey.getEndDate());
            ps.setInt(6, survey.getNumberOfRespondents());
            ps.executeUpdate();            
            ps.close();
            cn.close();
        }
      
//        public static void main(String[] args) throws Exception {
//            
//            List<Survey> survey1 = findAllSurvey();
//            for (int i = 0; i < survey1.size(); i++) {
//                System.out.println(survey1.get(i).getTitle());
//            }
//    }
}
