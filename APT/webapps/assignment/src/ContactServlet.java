import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class ContactServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {  
       PrintWriter out = res.getWriter();  
       res.setContentType("text/html");  
       out.println("<html><body>"); 
       Connection conn2 = null;
       try{
        conn2 = DriverManager.getConnection("jdbc:sqlite:contacts.db");
        try {  
            /**
             
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
 
             */ 
            Statement stmt = conn2.createStatement();  
            ResultSet result = stmt.executeQuery("SELECT * FROM CONTACTS");  
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>CID</th><th>NAME</th><th>EMAIL</th><tr>");  
            while (result.next()){  
                 int cid  = result.getInt("CID");
                 String name = result.getString("NAME");
                 String email = result.getString("EMAIL"); 
                 out.println("<tr><td>" + cid + "</td><td>" + name + "</td><td>" + email + "</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            conn2.close();  
           }catch (Exception e){ 
             String errormsg = e.getMessage(); 
            out.println(errormsg);  
        } 
       }catch(Exception ex){
        out.println(ex.getMessage());
    }
        
   } 
}