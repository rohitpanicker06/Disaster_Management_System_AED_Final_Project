/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitalSigns;

import doctor.Doctor;

/**
 *
 * @author rohitpanicker
 */
public class VitalSigns {
    
    int bodyTemperature;
    int pulseRate;
    int respirationRate;
    String bloodPressure;
    private Doctor doctor;

    public VitalSigns(int bodyTemperature, int pulseRate, int respirationRate, String bloodPressure, Doctor doctor) {
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
        this.doctor = doctor;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
