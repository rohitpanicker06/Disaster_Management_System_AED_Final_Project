/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Navy;

import java.util.ArrayList;

/**
 *
 * @author gayatrisk
 */
public class NavyReportDirectory {
    
    private static ArrayList<NavyReport> navyReportList = new ArrayList<>();

    public static ArrayList<NavyReport> getNavyReportList() {
        return navyReportList;
    }

    public static void setNavyReportList(ArrayList<NavyReport> navyReportList) {
        NavyReportDirectory.navyReportList = navyReportList;
    }
    
    
    
}
