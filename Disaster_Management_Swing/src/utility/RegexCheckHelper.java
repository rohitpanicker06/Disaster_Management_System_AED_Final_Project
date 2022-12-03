/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rohitPanicker
 */
public class RegexCheckHelper {

    public static boolean dynamicRegexCheckHelper(String regex, String variableString) {
        Pattern p = Pattern.compile(regex);
        if (variableString == null) {
            return false;
        }

        Matcher m = p.matcher(variableString);

        return m.matches();

    }
    
    

}
