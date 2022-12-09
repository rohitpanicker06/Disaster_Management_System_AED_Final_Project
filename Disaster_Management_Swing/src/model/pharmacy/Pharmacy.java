/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacy;

import java.util.ArrayList;

/**
 *
 * @author rohitpanicker
 */
public class Pharmacy {
    String pharmacy_name;
    int pharmacy_Id;
    ArrayList<Medicine> medicineList;

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

    public int getPharmacy_Id() {
        return pharmacy_Id;
    }

    public void setPharmacy_Id(int pharmacy_Id) {
        this.pharmacy_Id = pharmacy_Id;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addMedicine(Medicine medicine)
    {
        medicineList.add(medicine);
    }
    
}
