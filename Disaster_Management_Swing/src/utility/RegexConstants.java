/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author rohitPanicker
 */
public class RegexConstants {

    public static String NAME_REGEX = "\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)+";
    public static String INTEGER_REGEX = "[0-9]+";
    public static String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public static String PHONE_NUMBER_VALIDATOR_10_DIGIT = "^[0-9]{10}$";
    public static String BLOOD_PRESSURE_REGEX = "[0-9]+/[0-9]+";
    public static String BODY_TEMP = "[0-9]+\\.[0-9]+";
    public static String STRONG_PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    public static String USERNAME_REGEX = "^[a-zA-Z]([._-]?[a-zA-Z0-9]+)*$";

}
