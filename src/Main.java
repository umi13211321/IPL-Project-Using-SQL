import java.sql.Connection;
import java.sql.DriverManager;
import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection DataBase = new Connection("IPL_Data_Base", "postgres" , "101010");
    }

    public Connection connectToDataBase(String dataBaseName, String userName, String passWord){
        Connection connectoin=null;
        try{
            Class.forName("org.postgresql.Driver");
            connectoin = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dataBaseName,userName,passWord);
            if(connectoin!=null){
                System.out.println("Connection Established");
            }
            else{
                System.out.println("Connection Failed");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return connectoin;
    }
}