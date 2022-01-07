/*
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*; 

public class ContactServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    Connection conn2 = null;
    try{
        conn2 = DriverManager.getConnection("jdbc:sqlite:contacts.db");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try {

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Database Result";


        Statement stmt2 = conn2.createStatement();
        ResultSet result = stmt2.executeQuery("SELECT * FROM CONTACTS");
        out.println("CID\t\tNAME\t\tEMAIL");
        while(result.next()){
            int cid  = result.getInt("CID");
            String name = result.getString("NAME");
            String email = result.getString("EMAIL");
            out.println(cid+"\t\t"+name+"\t\t"+email);
        }

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    
    }
}
*/