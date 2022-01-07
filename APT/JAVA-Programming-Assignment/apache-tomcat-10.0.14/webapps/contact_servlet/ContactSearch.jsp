
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Contact Search</title>
</head>
<body>
    <!--java code goes here-->
    <%@page import="java.sql.DriverManager"%>
    <%@page import="java.sql.ResultSet"%>
    <%@page import="java.sql.Statement"%>
    <%@page import="java.sql.Connection"%>

    <%  
    Connection conn2 = null;
    String query = request.getParameter("query");
    try{
        conn2 = DriverManager.getConnection("jdbc:sqlite:/home/rishav/Git/assignment/APT/JAVA-Programming-Assignment/apache-tomcat-10.0.14/webapps/contact_servlet/contacts.db");
    }catch(Exception e){
        e.getMessage();
    }  
    %>
    <center>
        <style>
            input{
                height: 100px;
                margin-top: 50px;
                width: 300px;

            }
            button{
                height: 100px;
                width: 200px;
                background-color: brown;
                font-size: large;
                color: white;
            }
            #query{
                font-size: x-large;
            }
        </style>
        <h1>Contact Search JSP Implementation</h1>
        <form id="form" method="POST" action="ContactSearch.jsp"> 
        <input type="search" id="query" name="query" placeholder="Search using name">
        <button type="submit">Search</button>
        </form>
        <hr>
        <hr>
        <table border=1 width=50% height=50%>  
        <%
        try{
           Statement stmt = conn2.createStatement();  
            ResultSet result = stmt.executeQuery("SELECT * FROM CONTACTS WHERE NAME="+"'"+query+"'"); 
            %> 
            <tr><th>CID</th><th>NAME</th><th>EMAIL</th><tr>
            <table border=1 width=50% height=50%> 
            <%
            while (result.next()){  
                %>
                <tr>
                    <td><%=result.getInt("CID") %></td>
                    <td><%=result.getString("NAME") %></td>
                    <td><%=result.getString("EMAIL") %></td>
                    </tr>
                    <%
                    }  
            conn2.close();
            }catch(Exception ex){
                %>
                <p> <%= ex.getMessage() %> </p>
            <%
            }
            %>
        </table>
    </center>

</body>
</html>


