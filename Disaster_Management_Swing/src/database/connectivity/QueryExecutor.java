/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.connectivity;

import static database.connectivity.DataBaseConnection.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


/**
 *
 * @author rohitpanicker
 */
public class QueryExecutor {
    
    
    
    public static ResultSet executeQuery(String queryString) throws SQLException, ClassNotFoundException
    {
         Connection dbCon = DataBaseConnection.getInstance().getConnectionInstance();
         ResultSet rs = null;
       
        Statement stmt=dbCon.createStatement();  
         rs=stmt.executeQuery(queryString); 
         return rs;

}
    
    public static boolean validateCreds(String userName, String password) throws SQLException, ClassNotFoundException
    {
        
        String query = "Select UserName, Pass from Users where UserName=\""+userName+"\";";
        ResultSet rs = executeQuery(query);
        while(rs.next())
        {
            String pass = rs.getString("Pass");
            return pass.equals(password);
        }
        return false;
    }
    
    public static void signupUser(String userName, String password) throws SQLException, ClassNotFoundException
    {
         StringBuffer query = new StringBuffer("INSERT INTO Users(User_ID, UserName, Pass) Values(2,");
           query.append("\"").append(userName).append("\",").append("\"").append(password).append("\");");
          System.out.println(query.toString());
           Connection dbCon = DataBaseConnection.getInstance().getConnectionInstance();
         ResultSet rs = null;
       
        Statement stmt=dbCon.createStatement();
        stmt.executeUpdate(query.toString()); 
    }
    
   
    
}
