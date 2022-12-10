/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse;

import Disaster.Disaster;



/**
 *
 * @author gayatrisk
 */
public class CivilResponseReport {
    
    private String crReportId;
    private Disaster crDisaster;
    private String lvlOfSeverity;
    private String lvlOfRisk;
    private boolean armyAssigned;
    private boolean navyAssigned;
    private boolean policeAssigned;

    public String getCrReportId() {
        return crReportId;
    }

    public void setCrReportId(String crReportId) {
        this.crReportId = crReportId;
    }

    public Disaster getCrDisaster() {
        return crDisaster;
    }

    public void setCrDisaster(Disaster crDisaster) {
        this.crDisaster = crDisaster;
    }    

    public String getLvlOfSeverity() {
        return lvlOfSeverity;
    }

    public void setLvlOfSeverity(String lvlOfSeverity) {
        this.lvlOfSeverity = lvlOfSeverity;
    }

    public String getLvlOfRisk() {
        return lvlOfRisk;
    }

    public void setLvlOfRisk(String lvlOfRisk) {
        this.lvlOfRisk = lvlOfRisk;
    }

    public boolean isArmyAssigned() {
        return armyAssigned;
    }

    public void setArmyAssigned(boolean armyAssigned) {
        this.armyAssigned = armyAssigned;
    }

    public boolean isNavyAssigned() {
        return navyAssigned;
    }

    public void setNavyAssigned(boolean navyAssigned) {
        this.navyAssigned = navyAssigned;
    }

    public boolean isPoliceAssigned() {
        return policeAssigned;
    }

    public void setPoliceAssigned(boolean policeAssigned) {
        this.policeAssigned = policeAssigned;
    }
    


    
    
    
    
    
}
