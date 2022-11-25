/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.state.city;

/**
 *
 * @author rohitpanicker
 */
public class City {
    
    private String state;
    private String country;
    private String name;

    public City() {
    }

    public City(String state, String country, String name) {
        this.state = state;
        this.country = country;
        this.name = name;
    }

   

    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
