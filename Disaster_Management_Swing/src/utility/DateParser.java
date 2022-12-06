/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author rohitpanicker
 */
public class DateParser {

    public static Date getDateFromString(String date) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date dateGenerated = simpleDateFormat.parse(date);
        return dateGenerated;
    }
    
    public static Date getCurrentDate() throws ParseException
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    String dateNow = formatter.format(date);
    return DateParser.getDateFromString(dateNow);
    }
    
}
