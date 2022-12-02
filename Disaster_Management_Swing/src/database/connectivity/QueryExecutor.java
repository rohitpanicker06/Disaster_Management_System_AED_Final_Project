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
    
    
   
    public static void main(String[] args) throws SQLException {
        
       
        ResultSet set = executeQuery("Select * from Diseases where SLNO=2");    
        while(set.next()) {
        System.out.println(set.getInt(1)+"  "+set.getString(2)+"  "+set.getString(3));  
        }   
    }
    
    
    public static ResultSet executeQuery(String queryString) throws SQLException
    {
         Connection dbCon = DataBaseConnection.getInstance().getConnectionInstance();
         ResultSet rs = null;
       
        Statement stmt=dbCon.createStatement();  
         rs=stmt.executeQuery(queryString); 
         return rs;
    
    
}
}
