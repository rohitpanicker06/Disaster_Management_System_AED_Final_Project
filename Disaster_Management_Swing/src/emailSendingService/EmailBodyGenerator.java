/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailSendingService;

import java.util.Date;
import javax.mail.Session;

/**
 *
 * @author rohitpanicker
 */
public class EmailBodyGenerator {
    
    
    String from = null;
    String to = null;
    String subject = null;
    String OTP = null;
    String message = null;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getOTP() {
        return OTP;
    }

    public String getMessage() {
        return message;
    }



    public EmailBodyGenerator setFrom(String from) {
        this.from = from;
        return this;
    }

    public EmailBodyGenerator setTo(String to) {
        this.to = to;
        return this;
    }

    public EmailBodyGenerator setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBodyGenerator setOTP(String OTP) {
        this.OTP = OTP;
        return this;
    }


    public EmailBodyGenerator setMessage(String message) {
        this.message = message;
        return this;
    }
   
}
