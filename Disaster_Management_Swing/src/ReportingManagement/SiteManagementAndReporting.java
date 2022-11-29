/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReportingManagement;
//A SiteManagementAndReporting organization class will have employees attribute. To be modelled further..

import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class SiteManagementAndReporting {
    private int siteMangmntOrgID;
    private String noOfEmployees;
    private static ArrayList<SiteReportingEmployee> siteReportingEmpList = new ArrayList<>(); //this arraylist stores the sitereporting employees of the SiteReportingEmployee class

    public int getSiteMangmntOrgID() {
        return siteMangmntOrgID;
    }

    public void setSiteMangmntOrgID(int siteMangmntOrgID) {
        this.siteMangmntOrgID = siteMangmntOrgID;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(String noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

   

//    public String getDisasterEvents() {
//        return disasterEvents;
//    }
//
//    public void setDisasterEvents(String disasterEvents) {
//        this.disasterEvents = disasterEvents;
//    }

    public static ArrayList<SiteReportingEmployee> getSiteReportingEmpList() {
        return siteReportingEmpList;
    }

    public static void setSiteReportingEmpList(ArrayList<SiteReportingEmployee> siteReportingEmpList) {
        SiteManagementAndReporting.siteReportingEmpList = siteReportingEmpList;
    }
    
    public void addNewSiteReportingEmployee(SiteReportingEmployee siteRepEmp){
        siteReportingEmpList.add(siteRepEmp);
    }
    
    
    //to ask doubt whether a method to remove employee should be specified here
        
    
}
