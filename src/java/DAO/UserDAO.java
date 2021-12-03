package DAO;

import Beans.User;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO {
    
    private static Connection cn;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static User SearchUserByPassword(String email, String password) throws Exception{
        
        String sql = "SELECT *FROM Users WHERE Email=? AND Password=?";
        cn = Conexion.getConexion();
        ps = cn.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, password);
        rs = ps.executeQuery();
        User u = new User();
        while (rs.next()) {            
            u.setIdUser(rs.getInt(1));
            u.setLastName(rs.getString(2));
            u.setName(rs.getString(3));
            u.setCode(rs.getString(5));
            u.setSchool(rs.getInt(6));
            u.setFaculty(rs.getInt(7));
            u.setTipoAceso(rs.getInt(16));
        }
        rs.close();
        ps.close();
        cn.close();
        return u;
    }
    
    public static void main(String[] args) throws Exception {
        User user = SearchUserByPassword("jfloresgal@unprg.edu.pe", "flores2020");
        System.out.println(user.getName());
    }
}
