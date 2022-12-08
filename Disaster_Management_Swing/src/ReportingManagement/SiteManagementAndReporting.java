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
    //private int siteMangmntOrgID;
    private static ArrayList<SiteReportingEmployee> siteReportingEmpList = new ArrayList<>(); //this arraylist stores the sitereporting employees of the SiteReportingEmployee class
    private static ArrayList<InjuryKilledCasualties> injuryKilledList = new ArrayList<>();

    public ArrayList<SiteReportingEmployee> getSiteReportingEmpList() { //deleted "static" before the ArrayList word
        return siteReportingEmpList;
    }

    public void setSiteReportingEmpList(ArrayList<SiteReportingEmployee> siteReportingEmpList) {  //deleted "static" before the Void word
        SiteManagementAndReporting.siteReportingEmpList = siteReportingEmpList;
    }

    public ArrayList<InjuryKilledCasualties> getInjuryKilledList() {
        return injuryKilledList;
    }

    public void setInjuryKilledList(ArrayList<InjuryKilledCasualties> injuryKilledList) {
        SiteManagementAndReporting.injuryKilledList = injuryKilledList;
    }
    
    

    
    public void addNewSiteReportingEmployee(SiteReportingEmployee siteRepEmp){
        siteReportingEmpList.add(siteRepEmp);
    }
    
    public void addNewInjuredKilledCasualties(InjuryKilledCasualties injkilled){
        injuryKilledList.add(injkilled);
    }
    
    
    
    
    
    //to ask doubt whether a method to remove employee should be specified here
        
    
}
