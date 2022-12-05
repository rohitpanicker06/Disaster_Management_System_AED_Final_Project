/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.connectivity;

import java.sql.*;

/**
 *
 * @author rohitpanicker
 */
public class DataBaseConnection {
   private static String url ="jdbc:mysql://localhost:3306/";
   private static String databaseName="AED_FINAL_PROJECT";
   private static boolean verifyServerCertificate = false;
   private static boolean useSSL = true;
   static Connection con = null;
   private static DataBaseConnection dbConn;
   private String userName = "root";
   private String password = "Welcometopune18@";
   
   private DataBaseConnection(){
       
      String urlString = getDatabaseURL();  
      try{

         con = DriverManager.getConnection(urlString,userName,password);
      }catch(Exception e)
      {
          System.out.println("Encountered error while creating database connection = " + e.toString());
      }
   }
   
   private String getDatabaseURL()
   {
        StringBuffer urlString = new StringBuffer(url);
       urlString.append(databaseName);
       if(verifyServerCertificate)
       {
           urlString.append("?verifyServerCertificate=true");
       }else{
       urlString.append("?verifyServerCertificate=false");
       }
       
       if(useSSL)
       {
           urlString.append("&useSSL=true");
       }else{
           urlString.append("&useSSL=false");
       }
       
       return urlString.toString();
   }
   
   public static DataBaseConnection getInstance()
    {
        if (dbConn==null)
            dbConn = new DataBaseConnection();
        return dbConn;
    }

    Connection getConnectionInstance() {
      return con;
    }
    }
    
    

