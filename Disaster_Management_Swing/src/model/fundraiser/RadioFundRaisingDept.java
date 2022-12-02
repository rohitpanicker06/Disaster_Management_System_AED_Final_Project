/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fundraiser;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rohitpanicker
 */
public class RadioFundRaisingDept implements FundRaisingDepartment{
    
    int moneyRaised = 0;
    public static Queue<DisasterFundRaiser> fundRaisingRequest = new LinkedList<>();

    public int getMoneyRaised() {
        return moneyRaised;
    }

    public void setMoneyRaised(int moneyRaised) {
        this.moneyRaised = moneyRaised;
    }

    public Queue<DisasterFundRaiser> getFundRaisingRequest() {
        return fundRaisingRequest;
    }

    public void setFundRaisingRequest(Queue<DisasterFundRaiser> fundRaisingRequest) {
        this.fundRaisingRequest = fundRaisingRequest;
    }
    
    
}
