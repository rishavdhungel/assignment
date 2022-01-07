package Misc;
import java.security.cert.CertPathParameters;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateNewTable {

    public static void createNewTable(){
    
    try{
    //SQLite connection string
     String url = "jdbc:sqlite:/home/rishav/Git/assignment/APT/JAVA-Programming-Assignment/Contacts.db";
     //SQL statement for table creation
     Connection conn = DriverManager.getConnection(url);
     Statement statementsql = conn.createStatement();
     String sql = "CREATE TABLE IF NOT EXISTS Contacts"
         + "cid INTEGER PRIMARY KEY AUTOINCREMENT,"
         + "name TEXT NOT NULL, "
         + "email TEXT NOT NULL UNIQUE)";
      
        
            //create a new table
            statementsql.execute(sql);
            System.out.println("Table Created Successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createNewTable();
    }
}
