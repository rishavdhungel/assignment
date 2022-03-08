import java.sql.*;
public class SQlitejdbc {
    static final String url = "jdbc:sqlite:contact.db";
    static  final String query = "CREATE TABLE IF NOT EXISTS CONTACTDETAILS CID(INT PRIMARY KEY, NAME TEXT,EMAIL TEXT)";
    static final String query2 = "INSERT OR REPLACE INTO CONTACTDETAILS (CID,NAME,EMAIL) VALUES(1,Rishav,rishav@gmail.com)";
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);
            stmt.executeQuery(query2);
            stmt.close();

        }catch(Exception e){
            e.getMessage();
        }
    }
}
