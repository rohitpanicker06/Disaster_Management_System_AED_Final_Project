/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.application.user;


import java.util.ArrayList;
import java.util.HashMap;




/**
 *
 * @author rohitpanicker
 */
public class UserListDirectory {
    
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<User> patientList = new ArrayList<>();
    private static ArrayList<User> systemAdminList = new ArrayList<>();
    private static ArrayList<User> doctorUserList = new ArrayList<>();
    private static ArrayList<User> hospitalAdminList = new ArrayList<>();


    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        UserListDirectory.userList = userList;
    }

    public static ArrayList<User> getPatientList() {
        return patientList;
    }

    public static void setPatientList(ArrayList<User> patientList) {
        UserListDirectory.patientList = patientList;
    }

    public static ArrayList<User> getSystemAdminList() {
        return systemAdminList;
    }

    public static void setSystemAdminList(ArrayList<User> systemAdminList) {
        UserListDirectory.systemAdminList = systemAdminList;
    }

    public static ArrayList<User> getDoctorUserList() {
        return doctorUserList;
    }

    public static void setDoctorUserList(ArrayList<User> doctorUserList) {
        UserListDirectory.doctorUserList = doctorUserList;
    }

    public static ArrayList<User> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public static void setHospitalAdminList(ArrayList<User> hospitalAdminList) {
        UserListDirectory.hospitalAdminList = hospitalAdminList;
    }

   
    
   
    
    public User getUser(String userName, ArrayList<User> userList)
    {
        for(User user: userList)
        {
            if(user.getUserName().equals(userName)){
                return  user;
            }
        }
        return null;
    }
    
    public User getUser(String name, int selectedIndex )
    {
         User user = null;
        switch (selectedIndex) {
            case 0 -> user = getUser(name, systemAdminList);
            case 1 -> user = getUser(name, patientList);
            case 2 -> user = getUser(name, doctorUserList);
            case 3 -> user = getUser(name, hospitalAdminList);
           
            default -> {
            }
        }
        return user;
    }
    
    public boolean checkUserValidation(String name, String password, int selectedIndex){
        User user = null;
        switch (selectedIndex) {
            case 0 -> user = getUser(name, systemAdminList);
            case 1 -> user = getUser(name, patientList);
            case 2 -> user = getUser(name, doctorUserList);
            case 3 -> user = getUser(name, hospitalAdminList);
            
            default -> {
            }
        }
        
       if(user != null)
       {
            return user.getPassword().equals(password);
       }else{
           return false;
       }
    }
    
    public void addNewUser(String name, String password)
    {
        User user = new User(name, password);
        userList.add(user);
         
    }
  
    
    
}