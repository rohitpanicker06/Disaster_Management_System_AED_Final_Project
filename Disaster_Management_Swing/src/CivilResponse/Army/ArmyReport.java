/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CivilResponse.Army;

/**
 *
 * @author gayatrisk
 */
public class ArmyReport {
    
    private int armyReportId;
    private ArmyEmployee armyEmp;
    private int noOfOfficersAssigned;
    private String inventoryAssigned;
    private boolean immediateResponse;
    private String dateOfOperation;
    private String operationStatus;

    public int getArmyReportId() {
        return armyReportId;
    }

    public void setArmyReportId(int armyReportId) {
        this.armyReportId = armyReportId;
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
