/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailSendingService;

import java.util.Properties;

/**
 *
 * @author rohitpanicker
 */
public class PropertyConfiguration {

    private static PropertyConfiguration propertyConfiguration = null;
    private static Properties props = null;
    final static String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    private PropertyConfiguration() {
       
    }

    public  Properties getProps() {
        return props;
    }

    public static void setProps(Properties props) {
        PropertyConfiguration.props = props;
    }
    
    public static  PropertyConfiguration getInstance()
    {
        if(propertyConfiguration == null)
        {
           initializeProperties() ;
           propertyConfiguration = new PropertyConfiguration();
        }
            return propertyConfiguration;
        
    }
    
    public static void  initializeProperties()
    {
      props = System.getProperties();
    props.setProperty("mail.smtp.host", "smtp.gmail.com");
    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
    props.setProperty("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.port", "587");
    props.setProperty("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.auth", "true");
    props.put("mail.debug", "true");
    props.put("mail.store.protocol", "pop3");
    props.put("mail.smtp.starttls.required", "false");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.transport.protocol", "smtp");
    }
    
   
}
