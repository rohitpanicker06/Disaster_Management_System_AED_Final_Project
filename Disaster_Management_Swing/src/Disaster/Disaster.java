/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disaster;

import ReportingManagement.InjuryKilledCasualties;
import ReportingManagement.SiteReportingEmployee;
import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class Disaster {
    
    private int disasterId;
    private String disasterEvent; //type of disaster
    private String disasterTime;
    private String disasterDate;
    private String disasterLocation;
    private String disasterCoordinates; //latitude longitude values
    private  ArrayList<SiteReportingEmployee> siteReportingEmpList = new ArrayList<>(); //this arraylist stores the sitereporting employees of the SiteReportingEmployee class
    private  ArrayList<InjuryKilledCasualties> injuryKilledList = new ArrayList<>();

    public  ArrayList<SiteReportingEmployee> getSiteReportingEmpList() {
        return siteReportingEmpList;
    }

    public  void setSiteReportingEmpList(ArrayList<SiteReportingEmployee> siteReportingEmpList) {
        siteReportingEmpList = siteReportingEmpList;
    }

    public  ArrayList<InjuryKilledCasualties> getInjuryKilledList() {
        return injuryKilledList;
    }

    public  void setInjuryKilledList(ArrayList<InjuryKilledCasualties> injuryKilledList) {
        injuryKilledList = injuryKilledList;
    }
   

    public int getDisasterId() {
        return disasterId;
    }

    public void setDisasterId(int disasterId) {
        this.disasterId = disasterId;
    }

    public String getDisasterEvent() {
        return disasterEvent;
    }

    public void setDisasterEvent(String disasterEvent) {
        this.disasterEvent = disasterEvent;
    }

    public String getDisasterTime() {
        return disasterTime;
    }

    public void setDisasterTime(String disasterTime) {
        this.disasterTime = disasterTime;
    }

    public String getDisasterDate() {
        return disasterDate;
    }

    public void setDisasterDate(String disasterDate) {
        this.disasterDate = disasterDate;
    }

    public String getDisasterLocation() {
        return disasterLocation;
    }

    public void setDisasterLocation(String disasterLocation) {
        this.disasterLocation = disasterLocation;
    }

    public String getDisasterCoordinates() {
        return disasterCoordinates;
    }

    public void setDisasterCoordinates(String disasterCoordinates) {
        this.disasterCoordinates = disasterCoordinates;
    }

//    public ArrayList<Disaster> getNewDisasterList() {
//        return newDisasterList;
//    }
//
//    public void setNewDisasterList(ArrayList<Disaster> newDisasterList) {
//        this.newDisasterList = newDisasterList;
//    }

    public Disaster(int disasterId, String disasterEvent, String disasterTime, String disasterDate, String disasterLocation, String disasterCoordinates) {
        this.disasterId = disasterId;
        this.disasterEvent = disasterEvent;
        this.disasterTime = disasterTime;
        this.disasterDate = disasterDate;
        this.disasterLocation = disasterLocation;
        this.disasterCoordinates = disasterCoordinates;
    }
    
    public Disaster(){
        
    }
    
    
    
    

    
    
    
    
    @Override
    public String toString()
    {
        return this.disasterEvent;
    }
        
}
