/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Navy.NavyEmployee;
import CivilResponse.Police.PoliceEmployee;
import java.util.HashMap;

/**
 *
 * @author gayatrisk
 */
public class OfficerAllocation {
    
    public static HashMap<ArmyEmployee, CivilResponseReport> ArmyOffAllocation = new HashMap<>();
    public static HashMap<NavyEmployee, CivilResponseReport> NavyOffAllocation = new HashMap<>();
    public static HashMap<PoliceEmployee, CivilResponseReport> PoliceOffAllocation = new HashMap<>();

    public static HashMap<ArmyEmployee, CivilResponseReport> getArmyOffAllocation() {
        return ArmyOffAllocation;
    }

    public static void setArmyOffAllocation(HashMap<ArmyEmployee, CivilResponseReport> ArmyOffAllocation) {
        OfficerAllocation.ArmyOffAllocation = ArmyOffAllocation;
    }

    public static HashMap<NavyEmployee, CivilResponseReport> getNavyOffAllocation() {
        return NavyOffAllocation;
    }

    public static void setNavyOffAllocation(HashMap<NavyEmployee, CivilResponseReport> NavyOffAllocation) {
        OfficerAllocation.NavyOffAllocation = NavyOffAllocation;
    }

    public static HashMap<PoliceEmployee, CivilResponseReport> getPoliceOffAllocation() {
        return PoliceOffAllocation;
    }

    public static void setPoliceOffAllocation(HashMap<PoliceEmployee, CivilResponseReport> PoliceOffAllocation) {
        OfficerAllocation.PoliceOffAllocation = PoliceOffAllocation;
    }
    
    

}
