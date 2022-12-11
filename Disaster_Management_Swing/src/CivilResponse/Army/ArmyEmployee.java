/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Army;

import CivilResponse.CivilResponseReport;
import Disaster.DisasterDirectory;
import java.util.ArrayList;
import person.Person;

/**
 *
 * @author gayatrisk
 */
public class ArmyEmployee {
    
    private String empId;
    private Person person;
    private String Squad;
    private ArrayList<CivilResponseReport> crReportList = new ArrayList<>();

    public ArmyEmployee(String empId, Person person, String Squad) {
        this.empId = empId;
        this.person = person;
        this.Squad = Squad;
       
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
        return Squad;
    }

    public void setSquad(String Squad) {
        this.Squad = Squad;
    }

    public ArrayList<CivilResponseReport> getCrReportList() {
        return crReportList;
    }

    public void setCrReportList(ArrayList<CivilResponseReport> crReportList) {
        this.crReportList = crReportList;
    }
    
    
    @Override
    public String toString()
    {
        return this.empId;
    }
    
    
    
}
