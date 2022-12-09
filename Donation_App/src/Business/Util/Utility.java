/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author sarveshzeke
 */
public class Utility {
    
    public static final String ALPHA_NUMERIC_STRING = "@ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
public static String generatePassword()
   {
       int count = 5;
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) 
    {
         int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
         builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
   }

public static void SendEmail(String username,String password,String toMail) {    
                final String sender = "testac227@gmail.com";

	        final String senderPwd = ";lkjhj_11";       
        System.out.println("Inside Email ");
     

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        //properties.put("mail.smtp.ssl.trust", "*");
// properties.put("mail.smtp.password", pass);
        
        

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
       properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){  
        protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(sender, senderPwd);
	                    }
	                    
	                });

        try {
// Create a default MimeMessage object.
            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(sender));
	            message.setRecipients(
	                    Message.RecipientType.TO,
	                    InternetAddress.parse(toMail)
	            );
	            message.setSubject("Welcome! Your donation matters!");
	            message.setText("Dear " + username+" ,"
	                    + "\n\n " +" Access granted! \n" +" Please find your account details "+"\n Username:"
                           + username + "\nPasscode: " +password);
                  //  System.out.println("Inside Email2 ");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, sender, senderPwd);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
                JOptionPane.showMessageDialog(null,"Sent message successfully....");
            System.out.println("Sent message successfully....");
        } catch (MessagingException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }
}

