/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailSendingService;

import java.util.Date;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author rohitpanicker
 */
public class SendEmail {
    
    static SessionConfiguration session = SessionConfiguration.getInstance();
    
    public static int sendEmail(String message, String to) throws AddressException, MessagingException
    {
        Random random = new Random();
        String from="rohit.panicker16@vit.edu";
        int otp = random.nextInt(999999);
        EmailBodyGenerator emailBodyGenerator = new EmailBodyGenerator();
        emailBodyGenerator.setMessage(message).setTo(to).setFrom(from).setOTP(String.valueOf(otp));
        
        Message msg = new MimeMessage(session.getSession());
        
        
       msg.setFrom(new InternetAddress(emailBodyGenerator.getFrom()));
      msg.setRecipients(Message.RecipientType.TO, 
                        InternetAddress.parse(emailBodyGenerator.getTo(),false));
      msg.setSubject(emailBodyGenerator.getSubject());
      msg.setText(message + "  " +emailBodyGenerator.getOTP()); 
      msg.setSentDate(new Date());
      Transport.send(msg);
      System.out.println("Message sent.");
      return Integer.parseInt(emailBodyGenerator.getOTP());
    }
    
   
    
    
}
