/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacy;

/**
 *
 * @author rohitpanicker
 */
public class Medicine {
    
    private String name;
    private int medicineId;
    private String price;
    private String quantity_available;
    private String manufacturer;

    public Medicine(String name, int medicineId, String price, String quantity_available, String manufacturer) {
        this.name = name;
        this.medicineId = medicineId;
        this.price = price;
        this.quantity_available = quantity_available;
        this.manufacturer = manufacturer;
    }
   

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(String quantity_available) {
        this.quantity_available = quantity_available;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Medicine(String name, String price, String quantity_available, String manufacturer) {
        this.name = name;
        this.price = price;
        this.quantity_available = quantity_available;
        this.manufacturer = manufacturer;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(medicineId)+"- "+ name;
    }
    
}
