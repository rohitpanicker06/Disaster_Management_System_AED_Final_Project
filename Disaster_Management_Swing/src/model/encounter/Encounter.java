/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encounter;

import doctor.Doctor;
import java.time.LocalTime;
import java.util.Date;
import vitalSigns.VitalSigns;

/**
 *
 * @author rohitpanicker
 */
public class Encounter {
    
    private Date encounterDate;
    private VitalSigns vitalSigns;
    private LocalTime localTime;

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public Encounter(Date encounterDate, VitalSigns vitalSigns, LocalTime localTime) {
        
        this.encounterDate = encounterDate;
        this.vitalSigns = vitalSigns;
        this.localTime = localTime;
    }
    
    public boolean matchDate(Date date)
    {
        return getEncounterDate().compareTo(date) == 0;
    }
    
    
     @Override
    public String toString() {
        return this.encounterDate.toString();
    }
    
}
