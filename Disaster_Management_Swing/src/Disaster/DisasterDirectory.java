/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disaster;

import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class DisasterDirectory {
    
    private static ArrayList<Disaster> disasterList = new ArrayList<>(); 

    public static ArrayList<Disaster> getDisasterList() {
        return disasterList;
    }

    public static void setDisasterList(ArrayList<Disaster> disasterList) {
        DisasterDirectory.disasterList = disasterList;
    }
    
    public void addNewDisaster(Disaster dis){
        disasterList.add(dis);
    }
    
    
    //to ask doubt whether a method to remove disaster should be specified here
    
}
