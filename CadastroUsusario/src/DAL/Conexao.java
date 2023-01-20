package DAL;
import java.sql.*;

public class Conexao {
     public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/test";
        String user = "root";
        String password = "1234";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
          }catch (Exception e){
              System.out.println(e);
              return null;
          }
    }
}