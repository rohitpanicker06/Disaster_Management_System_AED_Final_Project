/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;


import encounter.EncounterHistory;
import java.util.ArrayList;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class PatientDirectory {
     public static  ArrayList<Patient> patientList ;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
      public PatientDirectory (){
          
       patientList = new ArrayList();

    }

    public Patient newPatient(Person newPatient, EncounterHistory encounterHistory, int insuranceId) {

        Patient patient = new Patient(newPatient, encounterHistory, insuranceId);
        patientList.add(patient);
        return patient;
    }
    
    public Patient newPatient(Person newPatient,int insuranceId) {

        Patient patient = new Patient(newPatient, insuranceId);
        patientList.add(patient);
        return patient;
    }
    
     public Patient newPatient(Person newPatient) {

        Patient patient = new Patient(newPatient);
        patientList.add(patient);
        return patient;
    }

    public Patient findPatient(Patient patient) {

        for (Patient patientProfile : patientList) {

            if (patientProfile.isMatch(patient)) {
                return patientProfile;
            }
        }
            return null; 
         }
}
