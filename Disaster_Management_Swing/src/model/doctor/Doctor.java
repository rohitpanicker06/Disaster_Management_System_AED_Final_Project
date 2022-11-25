/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import hospital.Hospital;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class Doctor {
    private Person person;
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor(Person person, Hospital hospital) {
        this.person = person;
        this.hospital = hospital;
    }
    
    public Doctor(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean isMatch(Doctor doctorProfile){
        
        return getPerson().getId().equals(doctorProfile.getPerson().getId());
    }
    
     @Override
    public String toString() {
        return String.valueOf(getPerson().getId());
    }
    
}
