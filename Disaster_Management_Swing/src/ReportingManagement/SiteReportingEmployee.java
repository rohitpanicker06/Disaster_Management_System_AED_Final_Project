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
//    private int killCount;
//    private int injuryCount;
    private String reportText;
    private String casualtyBox;
    private String casualtyName;
    private int casualtyAge;
    private long casualtyPhn;
    private String casualtyEmail;
    

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

//    public int getKillCount() {
//        return killCount;
//    }
//
//    public void setKillCount(int killCount) {
//        this.killCount = killCount;
//    }
//
//    public int getInjuryCount() {
//        return injuryCount;
//    }
//
//    public void setInjuryCount(int injuryCount) {
//        this.injuryCount = injuryCount;
//    }

    public String getReportText() {
        return reportText;
    }

    public void setReportText(String reportText) {
        this.reportText = reportText;
    }

    public String getCasualtyBox() {
        return casualtyBox;
    }

    public void setCasualtyBox(String casualtyBox) {
        this.casualtyBox = casualtyBox;
    }

    public String getCasualtyName() {
        return casualtyName;
    }

    public void setCasualtyName(String casualtyName) {
        this.casualtyName = casualtyName;
    }

    public int getCasualtyAge() {
        return casualtyAge;
    }

    public void setCasualtyAge(int casualtyAge) {
        this.casualtyAge = casualtyAge;
    }

    public long getCasualtyPhn() {
        return casualtyPhn;
    }

    public void setCasualtyPhn(long casualtyPhn) {
        this.casualtyPhn = casualtyPhn;
    }

    public String getCasualtyEmail() {
        return casualtyEmail;
    }

    public void setCasualtyEmail(String casualtyEmail) {
        this.casualtyEmail = casualtyEmail;
    }
    
    
    
    
    
}
