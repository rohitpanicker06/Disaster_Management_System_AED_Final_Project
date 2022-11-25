/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;


import doctor.Doctor;
import encounter.Encounter;
import encounter.EncounterHistory;
import hospital.Hospital;
import java.util.ArrayList;
import person.Person;
import vitalSigns.VitalSigns;

/**
 *
 * @author rohitpanicker
 */
public class Patient {
 private Person person;
    private EncounterHistory encounterHistory;
    private int insuranceId;
    private Hospital hospital;
    private Doctor doctor;
    
    public ArrayList<Encounter> getEncounterHistoryList() {
        return encounterHistory.getEncounterList();
        
    }
    
    public EncounterHistory getEncounterHistory(){
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    
   

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    

    public Patient(Person person, EncounterHistory encounterHistory, int insuranceId, Hospital hospital, Doctor doctor) {
        this.person = person;
        this.encounterHistory = encounterHistory;
        this.insuranceId = insuranceId;
        this.hospital = hospital;
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Patient(Person person, EncounterHistory encounterHistory, int insuranceId, Hospital hospital) {
        this.person = person;
        this.encounterHistory = encounterHistory;
        this.insuranceId = insuranceId;
        this.hospital = hospital;
    }

    public Patient(Person person, EncounterHistory encounterHistory, int insuranceId) {
        this.person = person;
        this.encounterHistory = encounterHistory;
        this.insuranceId = insuranceId;
    }

    public Patient(Person person, int insuranceId) {
        this.person = person;
        this.insuranceId = insuranceId;
        this.encounterHistory = new EncounterHistory();
        
    }
    
 
    
    public Patient(Person person) {
        this.person = person;
        this.encounterHistory = new EncounterHistory();
        this.insuranceId = 0;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean isMatch( Patient patient){
        
        return getPerson().getId().equals(patient.getPerson().getId());
    }
    
     @Override
    public String toString() {
        return String.valueOf(this.person.getId());
    }
    
    
    
}
