/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Police;

import java.util.ArrayList;

/**
 *
 * @author gayatrisk
 */
public class PoliceReportDirectory {
    
    private static ArrayList<PoliceReport> policeReport = new ArrayList<>();

    public static ArrayList<PoliceReport> getPoliceReport() {
        return policeReport;
    }

    public static void setPoliceReport(ArrayList<PoliceReport> policeReport) {
        PoliceReportDirectory.policeReport = policeReport;
    }
    
    
}
