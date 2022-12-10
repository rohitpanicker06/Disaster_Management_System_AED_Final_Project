/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fundraiser;

import Disaster.Disaster;
import Disaster.DisasterDirectory;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author rohitpanicker
 */
public class FundRaiserDirectory {
    
    
   public static ArrayList<DisasterFundRaiser> fundRaiserDirectory = new ArrayList<>();
   public static ArrayList<FundRaisingEmployee> employeeDirectory = new ArrayList<>();
    public static ArrayList<Disaster> disasterDirectory = new DisasterDirectory().getDisasterList();

    public ArrayList<DisasterFundRaiser> getFundRaiserDirectory() {
        return fundRaiserDirectory;
    }

    public void setFundRaiserDirectory(ArrayList<DisasterFundRaiser> fundRaiserDirectory) {
        this.fundRaiserDirectory = fundRaiserDirectory;
    }

    public ArrayList<FundRaisingEmployee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(ArrayList<FundRaisingEmployee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public ArrayList<Disaster> getDisasterDirectory() {
        return disasterDirectory;
    }

    public void setDisasterDirectory(ArrayList<Disaster> disasterDirectory) {
        this.disasterDirectory = disasterDirectory;
    }
  
    
}
