package Misc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowDatabaseContent {
    public static void showDatabaseContent() {
    String url = "jdbc:sqlite:/home/rishav/Git/assignment/APT/JAVA-Programming-Assignment/Contacts.db";
     //SQL statement for table creation
    String sql = "SELECT cid,name,email"
         + "FROM Contacts,\n"
         + ");";
        
    try{
        Connection conn = DriverManager.getConnection(url);
        Statement statementsql = conn.createStatement();
        ResultSet result = statementsql.executeQuery(sql);
        while(result.next()){
            System.out.println(result.getInt("cid")+"\t"+
                result.getString("name")+"\t"+
                result.getString("email"));
        }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
    
