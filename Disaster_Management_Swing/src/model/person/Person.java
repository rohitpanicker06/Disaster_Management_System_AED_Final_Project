/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import house.House;
import java.awt.Image;

/**
 *
 * @author rohitpanicker
 */public class Person {
    
    private String id;
    private String name;
    private String emailid;
    private long phoneNumber;
    private House residence;
    private String gender;
    private int age;
    Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    

    public Person(String id, String name, String emailid, long phoneNumber, House residence, String gender, int age, Image image) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.phoneNumber = phoneNumber;
        this.residence = residence;
        this.gender = gender;
        this.age = age;
        this.image = image;
    }

    public Person(String id, String name, String emailid, long phoneNumber, House residence, String gender, int age) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.phoneNumber = phoneNumber;
        this.residence = residence;
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
     public Person (String id){
        
        this.id = id;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    
    public boolean isMatch(String id){
        
        return getId().equals(id);
    }
    
    
    @Override
    public String toString()
    {
        return this.id.toString();
    }
}
