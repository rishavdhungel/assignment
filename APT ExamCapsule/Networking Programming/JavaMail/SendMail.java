import java.util.*;
import javax.mail.*;
public class SendMail {
    public static void main(String[] args) {
        
        final String username = "1811008_rishav@kusom.edu.np";//replace with your emaill here with less secure enable ane pop/Imap enabled from gmail setting. 
        final String password = "*********";//replace with your password

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587"); //465 for ssl
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS startssl for ssl
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
            message.addRecipient(Message.RecipientType.TO,new InternetAddress("rishavdhungel3@gmail.com"));
            // Set Subject: header field
                message.setSubject("Sending mail using java");
                message.setText("Hello from the Java mail");
                Transport.send(message);
        
        }catch(Exception e){
            e.getMessage();
        }
    }
    
}
