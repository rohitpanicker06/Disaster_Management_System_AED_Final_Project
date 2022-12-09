/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacy;

import java.util.ArrayList;

/**
 *
 * @author rohitpanicker
 */
public class PharmacyDirectory {
    
    public static ArrayList<Pharmacy> pharmacyDirectory = new ArrayList<>();
    
    public static Pharmacy getPharmacyByName(String name)
    {
        for(Pharmacy ph : pharmacyDirectory)
        {
            if(ph.getPharmacy_name().equals(name))
            {
                return ph;
            }
        }
        
        return null;
    }
    
    
     public static Pharmacy getPharmacyById(int id)
    {
        for(Pharmacy ph : pharmacyDirectory)
        {
            if(ph.getPharmacy_Id() == id)
            {
                return ph;
            }
        }
        
        return null;
    }
}
