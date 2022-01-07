import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Marketing {
    public static void main(String[] args) throws SQLException {
        Connection conn2 = null;
        try{
        conn2 = DriverManager.getConnection("jdbc:sqlite:contacts.db");
        }catch(Exception ex){
            ex.printStackTrace();
        }


        final String username = "1811008_rishav@kusom.edu.np";//replace with your emaill here with less secure enable ane pop/Imap enabled from gmail setting. 
        final String password = "********";//replace with your password

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        //make sure to comment the disabled service from the java.security 
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("1811008_rishav@kusom.edu.np"));//replace with your gmail

             //displaying all the imported contents
            Statement stmt2 = conn2.createStatement();
            ResultSet result = stmt2.executeQuery("SELECT * FROM CONTACTS");
            System.out.println("CID\t\tNAME\t\tEMAIL");
            while(result.next()){
                int cid  = result.getInt("CID");
                String name = result.getString("NAME");
                String email = result.getString("EMAIL");
                System.out.println(cid+"\t\t"+name+"\t\t"+email);
        
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));
            // Set Subject: header field
                message.setSubject("New Out Launch");
                // Now set the actual message
                message.setText("Dear "+name +"\n"+
                "\n"+
                "We are going to launch the new Outlet @ New Road.\n"+
                "Please visit in the opening date and grab the heavy discounts upto 80%.\n"+
                "\n"+
                "Thank you!\n"+
                "ABC Outlet");
                Transport.send(message);

                System.out.println("Done");
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
     
}
