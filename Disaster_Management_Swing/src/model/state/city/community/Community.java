/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.state.city.community;

import us.state.city.City;

/**
 *
 * @author rohitpanicker
 */
public class Community {
    
    private City city;

    public Community(City city, String communityName, String location, String zipCode) {
        this.city = city;
        this.communityName = communityName;
        this.location = location;
        this.zipCode = zipCode;
    }
    private String communityName;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    private String location;
    private String zipCode;
    
}
