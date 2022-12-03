/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disaster;

/**
 *
 * @author Rohit Paul G
 */
public class Disaster {
    
    private int disasterId;
    private String disasterEvent; //type of disaster
    private String disasterTime;
    private String disasterDate;
    private String disasterLocation;
    private String disasterCoordinates; //latitude longitude values

    public int getDisasterId() {
        return disasterId;
    }

    public void setDisasterId(int disasterId) {
        this.disasterId = disasterId;
    }

    public String getDisasterEvent() {
        return disasterEvent;
    }

    public void setDisasterEvent(String disasterEvent) {
        this.disasterEvent = disasterEvent;
    }

    public String getDisasterTime() {
        return disasterTime;
    }

    public void setDisasterTime(String disasterTime) {
        this.disasterTime = disasterTime;
    }

    public String getDisasterDate() {
        return disasterDate;
    }

    public void setDisasterDate(String disasterDate) {
        this.disasterDate = disasterDate;
    }

    public String getDisasterLocation() {
        return disasterLocation;
    }

    public void setDisasterLocation(String disasterLocation) {
        this.disasterLocation = disasterLocation;
    }

    public String getDisasterCoordinates() {
        return disasterCoordinates;
    }

    public void setDisasterCoordinates(String disasterCoordinates) {
        this.disasterCoordinates = disasterCoordinates;
    }
    
    @Override
    public String toString()
    {
        return this.disasterEvent;
    }
        
}
