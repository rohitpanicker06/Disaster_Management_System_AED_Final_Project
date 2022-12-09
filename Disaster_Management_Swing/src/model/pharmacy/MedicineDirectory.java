/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacy;

import database.connectivity.QueryExecutor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author rohitpanicker
 */
public class MedicineDirectory {
      public static ArrayList<Medicine> medicineDirectory = new ArrayList<>();
      
      static{
          try {
              ResultSet rs = QueryExecutor.executeQuery("SELECT * FROM MEDICINES");
              while(rs.next())
              {
                  Medicine medicine = new Medicine(rs.getString("MEDICINE_NAME"), Integer.parseInt(rs.getString("ID")), rs.getString("PRICE"), rs.getString("QUANTITY_AVAILABLE"), rs.getString("MANUFACTURER"));
                  medicineDirectory.add(medicine);
                  System.out.println("Added Medicine");
              }
          } catch (SQLException ex) {
              Logger.getLogger(MedicineDirectory.class.getName()).log(Level.SEVERE, null, ex);
          }
          
      }
    
    public static Medicine getMedicineByName(String name)
    {
        for(Medicine md : medicineDirectory)
        {
            if(md.getName().equals(name))
            {
                return md;
            }
        }
        
        return null;
    }
    
    
     public static Medicine getMedicineById(int id)
    {
        for(Medicine md : medicineDirectory)
        {
            if(md.getMedicineId() == id)
            {
                return md;
            }
        }
        
        return null;
    }
    
}
