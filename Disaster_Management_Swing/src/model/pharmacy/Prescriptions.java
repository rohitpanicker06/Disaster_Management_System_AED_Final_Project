/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacy;

import java.util.ArrayList;
import model.doctor.Doctor;
import model.patient.Patient;

/**
 *
 * @author rohitpanicker
 */
public class Prescriptions {
    
    ArrayList<Medicine> medicineList;
    String comments;
    int id;
    Doctor doctor;
    Patient patient;

    public Prescriptions(ArrayList<Medicine> medicineList, String comments, Doctor doctor, Patient patient,int id) {
        this.medicineList = medicineList;
        this.comments = comments;
        this.doctor = doctor;
        this.patient = patient;
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    

    public Prescriptions(String comments) {
        this.comments = comments;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Prescriptions(ArrayList<Medicine> medicineList, String comments) {
        this.medicineList = medicineList;
        this.comments = comments;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
}
