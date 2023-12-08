package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectToDriver {
    private final String db_url = "jdbc:postgresql://localhost:5432/habrdb";
    private final String user = "habrpguser";
    private final String pass = "pgpwd4habr";
    Connection connection = null;

     public void connect() throws SQLException {
         System.out.println("Test connection to Driver");
         try {
             Class.forName("org.postgresql.Driver");
         }catch(ClassNotFoundException e){
             System.out.println("Error connect to Driver");
             throw new RuntimeException(e);
         }
         System.out.println("We successfully connect to Driver");

         try{
             connection = DriverManager.getConnection(db_url, user, pass);
         } catch (SQLException e){
             System.out.println("Fail to get connection");
             throw new RuntimeException(e);
         }
         if(connection != null){
             System.out.println("We successfully get connection");
         } else{
             System.out.println("Fail to get connection");
         }

     }

}
