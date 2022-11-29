/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReportingManagement;

import Disaster.DisasterDirectory;
import person.Person;

/**
 *
 * @author Rohit Paul G
 */
public class SiteReportingEmployee {
    
    private int empId;
//    private String empFullName;
//    private String gender;
//    private long mobileNo;
//    private String emailId;
    private Person person;
    private DisasterDirectory disDir;
    

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

   
    public DisasterDirectory getDisDir() {
        return disDir;
    }

    public void setDisDir(DisasterDirectory disDir) {
        this.disDir = disDir;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
}
