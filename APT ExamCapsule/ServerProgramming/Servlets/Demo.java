import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Demo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try{
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");
            Integer a = 10;
            Integer b =11;
            Integer c = a+b;
            out.println("<html><body>");
            out.println("The sum of 10 and 11 is "+c);
            out.println("</body></html>");


        }catch(Exception e){
            e.getMessage();
        }
    }


    
    
}
