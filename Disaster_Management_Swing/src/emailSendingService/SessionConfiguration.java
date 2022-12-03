/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailSendingService;

import static emailSendingService.PropertyConfiguration.initializeProperties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author rohitpanicker
 */
public class SessionConfiguration {
    
    private static SessionConfiguration sessionConfiguration=null;
    private static Session session = null;

    public Session getSession() {
        return session;
    }

    private static   void initializeSession() {
        
        PropertyConfiguration propertyConfiguration = PropertyConfiguration.getInstance();
        
        session = Session.getDefaultInstance(propertyConfiguration.getProps(), 
    new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                "rohit.panicker16@vit.edu", "welcometopune18");// 
        }
});
}
   
     public static SessionConfiguration getInstance()
    {
        if(sessionConfiguration == null)
        {
           initializeSession() ;
           sessionConfiguration = new SessionConfiguration();
        }
            return sessionConfiguration;
        
    }
     
    
    
     
}
