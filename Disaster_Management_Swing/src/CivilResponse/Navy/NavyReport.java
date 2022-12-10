/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Navy;

import CivilResponse.Army.ArmyEmployee;

/**
 *
 * @author gayatrisk
 */
public class NavyReport {
    
    private int navyReportId;
    private ArmyEmployee armyEmp;
    private int noOfOfficersAssigned;
    private String inventoryAssigned;
    private boolean immediateResponse;
    private String dateOfOperation;
    private String operationStatus;

    public int getNavyReportId() {
        return navyReportId;
    }

    public void setNavyReportId(int navyReportId) {
        this.navyReportId = navyReportId;
    }

    public ArmyEmployee getArmyEmp() {
        return armyEmp;
    }

    public void setArmyEmp(ArmyEmployee armyEmp) {
        this.armyEmp = armyEmp;
    }

    public int getNoOfOfficersAssigned() {
        return noOfOfficersAssigned;
    }

    public void setNoOfOfficersAssigned(int noOfOfficersAssigned) {
        this.noOfOfficersAssigned = noOfOfficersAssigned;
    }

    public String getInventoryAssigned() {
        return inventoryAssigned;
    }

    public void setInventoryAssigned(String inventoryAssigned) {
        this.inventoryAssigned = inventoryAssigned;
    }

    public boolean isImmediateResponse() {
        return immediateResponse;
    }

    public void setImmediateResponse(boolean immediateResponse) {
        this.immediateResponse = immediateResponse;
    }

    public String getDateOfOperation() {
        return dateOfOperation;
    }

    public void setDateOfOperation(String dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }
    
    
    
    
}
