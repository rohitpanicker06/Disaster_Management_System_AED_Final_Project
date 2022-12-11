/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Police;

import CivilResponse.CivilResponseReport;
import Disaster.DisasterDirectory;
import java.util.ArrayList;
import person.Person;

/**
 *
 * @author gayatrisk
 */
public class PoliceEmployee {
    
    private String empId;
    private Person person;
    private String squad;
    private ArrayList<CivilResponseReport> reportList = new ArrayList<>();

    public PoliceEmployee(String empId, Person person, String squad) {
        this.empId = empId;
        this.person = person;
        this.squad = squad;
    }
    
    

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public ArrayList<CivilResponseReport> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<CivilResponseReport> reportList) {
        this.reportList = reportList;
    }

    
    
    
}
