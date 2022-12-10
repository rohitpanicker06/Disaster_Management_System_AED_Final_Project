/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Navy;

import Disaster.DisasterDirectory;
import person.Person;

/**
 *
 * @author gayatrisk
 */
public class NavyEmployee {
    
    private int empId;
    private Person person;
    private DisasterDirectory disDir;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public DisasterDirectory getDisDir() {
        return disDir;
    }

    public void setDisDir(DisasterDirectory disDir) {
        this.disDir = disDir;
    }
    
    
    
}
