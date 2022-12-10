/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse;

import java.util.ArrayList;

/**
 *
 * @author gayatrisk
 */
public class CivilResponseReportDirectory {
    
    private static ArrayList<CivilResponseReport> crReportList= new ArrayList<>();

    public static ArrayList<CivilResponseReport> getCrReportList() {
        return crReportList;
    }

    public static void setCrReportList(ArrayList<CivilResponseReport> crReportList) {
        CivilResponseReportDirectory.crReportList = crReportList;
    }
    
    
    public CivilResponseReport addNewReport() {
        
        CivilResponseReport newReport = new CivilResponseReport();
        crReportList.add(newReport);
        return newReport;
    }
    
        
    public void deleteReport(CivilResponseReport report){
        crReportList.remove(report);
    }
    
    
    
}
