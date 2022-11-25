/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encounter;

import doctor.Doctor;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import patient.Patient;
import person.Person;
import vitalSigns.VitalSigns;

/**
 *
 * @author rohitpanicker
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterList ;
    
    public EncounterHistory (){
          
       encounterList = new ArrayList();

    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Encounter newEcounter( Date encounterDate, VitalSigns vitalSigns, LocalTime localTime) {

        Encounter encounter = new Encounter(encounterDate, vitalSigns, localTime);
        encounterList.add(encounter);
        return encounter;
    }

    public ArrayList<Encounter> findEncounter(Date encounterDate) {
        ArrayList<Encounter> encounters = new ArrayList<>();
        for (Encounter ec : encounterList) {

            if (ec.matchDate(encounterDate)) {
                encounters.add(ec);
            }
        }
            if(encounters.isEmpty())
            {
                return null;
            }else{
                return encounters;
            }
         }
    
}
