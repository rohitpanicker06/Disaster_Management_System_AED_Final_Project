/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import doctor.Doctor;
import doctor.DoctorDirectory;
import java.util.ArrayList;
import patient.Patient;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class Hospital {

private String hospitalName;
private Community community;
private int hospitalId;
private ArrayList<Doctor> doctorList = new ArrayList<>();
private ArrayList<Patient> patientList = new ArrayList<>();

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Hospital(String hospitalName, Community community, int hospitalId) {
        this.hospitalName = hospitalName;
        this.community = community;
        this.hospitalId = hospitalId;
        
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorList;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

   
    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public boolean isMatchByName(String name)
    {
        if(getHospitalName().equals(name))
        {
            return true;
        }else{
            return false;
        }
    }

     @Override
    public String toString() {
        return String.valueOf(getHospitalId());
    }
    
}
