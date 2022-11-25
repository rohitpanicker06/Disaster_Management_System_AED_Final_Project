/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import house.House;
import java.util.ArrayList;

/**
 *
 * @author rohitpanicker
 */
public class PersonDirectory {
    public static ArrayList<Person> personList = new ArrayList<>() ;
    
   

    public Person newPerson(String id, String name, String emailid, long phoneNumber, House residence, String gender, int age) {

        Person person = new Person(id, name, emailid, phoneNumber, residence, gender, age);
        personList.add(person);
        return person;
    }

    public Person findPerson(String id) {

        for (Person p : personList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; 
         }
}
