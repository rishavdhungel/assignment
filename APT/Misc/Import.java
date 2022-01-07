import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.FileReader;
import java.io.BufferedReader;

//Creating the database and table 
public class Import {
    public  static void createdatabase(String filename){
        Connection conn = null;
        Statement statement = null;

        try{
            conn = DriverManager.getConnection("jdbc:sqlite:"+filename);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
                conn = DriverManager.getConnection("jdbc:sqlite:contacts.db");
                System.out.println("Opened database successfully");
                statement = conn.createStatement();
                String sql = "CREATE TABLE IF NOT EXISTS CONTACTS " +
                "(CID INT PRIMARY KEY,"+
                "NAME TEXT,"+
                "EMAIL TEXT)";
                statement.executeUpdate(sql);
                statement.close();
                conn.close();
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }
        System.out.println("Table created successfully.");

    }

//reading the csv file and writing in table using prepared statement
public static void readCsv(){
    Connection conn2 = null;
    int batchSize = 20;
    try{
    conn2 = DriverManager.getConnection("jdbc:sqlite:contacts.db");
    }catch(Exception ex){
        ex.printStackTrace();
    }

    try {
        PreparedStatement stmt = conn2.prepareStatement("INSERT OR REPLACE INTO CONTACTS (CID,NAME,EMAIL) VALUES(?,?,?)");
        BufferedReader br = new BufferedReader(new FileReader("contacts.csv"));
        br.readLine();
        String data;
        int count = 0;
        while ((data = br.readLine()) != null) {
            String[] values = data.split(",");
            String cid  = values[0];
            String name  = values[1];
            String email  = values[2];

            stmt.setString(1, cid);
            stmt.setString(2, name);
            stmt.setString(3,email);
            stmt.addBatch();
            if(count%batchSize ==0){
                stmt.executeBatch();
            }
        }
        br.close();
        stmt.executeBatch();
        
        System.out.println("data has been inserted succussfully"); 
        //displaying all the imported contents
        Statement stmt2 = conn2.createStatement();
        ResultSet result = stmt2.executeQuery("SELECT * FROM CONTACTS");
        System.out.println("CID\t\tNAME\t\tEMAIL");
        while(result.next()){
            int cid  = result.getInt("CID");
            String name = result.getString("NAME");
            String email = result.getString("EMAIL");
            System.out.println(cid+"\t\t"+name+"\t\t"+email);
        }
        conn2.close();
}catch(Exception e){
    e.printStackTrace();
}
}
public static void main(String[] args) {
    createdatabase("contacts.db");
    readCsv();
}
}
