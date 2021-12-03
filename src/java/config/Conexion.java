package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "database=SurveySystem;"
                    + "user=sa;"
                    + "password =03090409;";
            
            try {
                Connection con = DriverManager.getConnection(conexionUrl);
                
                return con;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return null;
            }
            
        }
    public static void main(String[] args) throws Exception {
        Connection cn = getConexion();
        if (cn!=null) {
            System.out.println("Conexion exitosa karnal");
        }
    }
}
