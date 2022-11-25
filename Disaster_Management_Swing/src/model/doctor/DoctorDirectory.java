/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import house.House;
import java.util.ArrayList;
import person.Person;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class DoctorDirectory {
    
     public static ArrayList<Doctor> doctorList;
     
     static{
         doctorList =  new ArrayList<>();
         
     }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
     
     
    

    public Doctor newDoctor(Person person) {

        Doctor doctor = new Doctor(person);
        doctorList.add(doctor);
        return doctor;
    }

    public Doctor findDoctor(Doctor doctorProfile) {

        for (Doctor doctor : doctorList) {

            if (doctor.isMatch(doctorProfile)) {
                return doctor;
            }
        }
            return null; 
         }

    public Doctor findDoctorByName(String name) {
       for(Doctor doctor : doctorList)
       {
           if(doctor.getPerson().getName().equals(name))
           {
               return doctor;
           }
       }
       return null;
    }

   
    
}
