/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse;

import Disaster.Disaster;
import java.util.ArrayList;

/**
 *
 * @author gayatrisk
 */
public class CivilResponseDisasterList {
    
    public static ArrayList<Disaster> CrDisasterArrayList = new ArrayList<>();

    public  ArrayList<Disaster> getCrDisasterArrayList() {
        return CrDisasterArrayList;
    }

    public  void setCrDisasterArrayList(ArrayList<Disaster> CrDisasterArrayList) {
        CivilResponseDisasterList.CrDisasterArrayList = CrDisasterArrayList;
    }
    
}
