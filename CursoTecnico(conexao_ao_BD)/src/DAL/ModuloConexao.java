package DAL;
import java.sql.*;

public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "org.mariadb.jdbc.Driver";//cada BD tem o seu
        String url = "jdbc:mariadb://localhost:3306/eco_uc16";//cada BD tem o seu
        String user = "root";
        String password = "1234";//sua senha
        
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
