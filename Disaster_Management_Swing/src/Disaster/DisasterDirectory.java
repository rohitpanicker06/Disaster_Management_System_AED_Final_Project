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
    
    public static ArrayList<Disaster> disasterList = new ArrayList<>(); 

    public ArrayList<Disaster> getDisasterList() {  //change public static to public
        return disasterList;
    }

    public void setDisasterList(ArrayList<Disaster> disasterList) { //change public static void to public void
        DisasterDirectory.disasterList = disasterList;
    }
    
    public void addNewDisaster(Disaster dis){
        disasterList.add(dis);
    }
    
    
    //to ask doubt whether a method to remove disaster should be specified here
    
}
