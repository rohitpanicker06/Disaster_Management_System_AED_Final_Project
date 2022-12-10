/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataForDisasterAndSiteManagementWorkflow;

import Disaster.Disaster;
import Disaster.DisasterDirectory;
import ReportingManagement.InjuryKilledCasualties;
import ReportingManagement.SiteManagementAndReporting;
import ReportingManagement.SiteReportingEmployee;

/**
 *
 * @author Rohit Paul G
 */
public class PopulateDataDisasterAndSiteManagement {

    public static void populateDataDisasterAndSiteManagement(){
        //for disaster class
        Disaster disaster = new Disaster(1234, "Tornado", "12:30PM", "04-Nov-2022", "Houston", "29.7604° N, 95.3698° W");
        Disaster disaster_new_value = new Disaster(5678, "Hurricane", "01:30AM", "05-Nov-2022", "El Paso", "31.7619° N, 106.4850° W");
        Disaster disaster_new_value2 = new Disaster(5679, "Earthquake", "07:45PM", "06-Nov-2022", "Oklahoma City", "35.4676° N, 97.5164° W");
        Disaster disaster_new_value3 = new Disaster(5680, "Wildfire", "03:45PM", "07-Nov-2022", "San Diego", "32.7157° N, 117.1611° W");
        Disaster disaster_new_value4 = new Disaster(5681, "Flood", "04:30PM", "08-Nov-2022", "Clearlake", "38.9582° N, 122.6264° W");
        
        DisasterDirectory.disasterList.add(disaster);
        DisasterDirectory.disasterList.add(disaster_new_value);
        DisasterDirectory.disasterList.add(disaster_new_value2);
        DisasterDirectory.disasterList.add(disaster_new_value3);
        DisasterDirectory.disasterList.add(disaster_new_value4);
        
        
        
        //for Site Reporting Employee and Injury Killed Casualties classes
        SiteReportingEmployee siteReportingEmp1 = new SiteReportingEmployee("Paul", 24, 857313020, "rohitpauldb@gmail.com");
        SiteReportingEmployee siteReportingEmp2 = new SiteReportingEmployee("Panicker", 24, 857313021, "panicker.r@gmail.com");
        SiteReportingEmployee siteReportingEmp3 = new SiteReportingEmployee("Preshanth", 24, 857313022, "preshupee@gmail.com");
        SiteReportingEmployee siteReportingEmp4 = new SiteReportingEmployee("Akshatha", 24, 857313023, "patil.aksha@gmail.com");
        SiteReportingEmployee siteReportingEmp5 = new SiteReportingEmployee("Ashwini", 25, 857313024, "ashwinithiru@gmail.com");
        
        
        
        InjuryKilledCasualties injuryKilledCasualties1 = new InjuryKilledCasualties(90, 44);
        InjuryKilledCasualties injuryKilledCasualties2 = new InjuryKilledCasualties(148, 78);
        InjuryKilledCasualties injuryKilledCasualties3 = new InjuryKilledCasualties(3000, 667);
        InjuryKilledCasualties injuryKilledCasualties4 = new InjuryKilledCasualties(3800, 700);
        InjuryKilledCasualties injuryKilledCasualties5 = new InjuryKilledCasualties(57, 1013);
        
        
        disaster.getSiteReportingEmpList().add(siteReportingEmp1);
        disaster.getInjuryKilledList().add(injuryKilledCasualties1);
        disaster_new_value.getSiteReportingEmpList().add(siteReportingEmp2);
        disaster_new_value.getInjuryKilledList().add(injuryKilledCasualties2);
        disaster_new_value2.getSiteReportingEmpList().add(siteReportingEmp3);
        disaster_new_value2.getInjuryKilledList().add(injuryKilledCasualties3);
        disaster_new_value3.getSiteReportingEmpList().add(siteReportingEmp4);
        disaster_new_value3.getInjuryKilledList().add(injuryKilledCasualties4);
        disaster_new_value4.getSiteReportingEmpList().add(siteReportingEmp5);
        disaster_new_value4.getInjuryKilledList().add(injuryKilledCasualties5);
        
       
        
        
        
        
        
        
    }
    
    
}
