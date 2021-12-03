package DAO;

import Beans.Question;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {
    
        private static Connection cn;
        private static PreparedStatement ps;
        private static ResultSet rs;
        public static List<Question> questions = new ArrayList<>();
        
        public static List FindBySurvey(int id) throws Exception{
            
            String sql = "SELECT*FROM Question where idSurvey="+id;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Question question;
            while(rs.next()){
                question = new Question();
                question.setIdQuestion(rs.getInt(1));
                question.setQuestion(rs.getString(2));
                question.setIdSurvey(rs.getInt(3));
                questions.add(question);
            }
            
            cn.close();
            ps.close();
            rs.close();
        
            return questions;
        }
        
        public static void main(String[] args) throws Exception {
        List<Question> q = FindBySurvey(1);
            for (Question question : q) {
                System.out.print(question.getIdQuestion());
                System.out.print(question.getQuestion());
                System.out.println(question.getIdSurvey());
            }
    }
}
