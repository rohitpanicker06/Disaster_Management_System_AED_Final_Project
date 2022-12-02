/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fundraiser;

import Disaster.Disaster;

/**
 *
 * @author rohitpanicker
 */
public class DisasterFundRaiser {
    
    Disaster disaster;
    String currency;
    long amount;

    public DisasterFundRaiser() {
    }

    public DisasterFundRaiser(Disaster disaster, String currency, long amount, TelevisionFundRaisingDept television, SocialMediaFundRaisingDept socialMedia, RadioFundRaisingDept radioFundRaisingDept) {
        this.disaster = disaster;
        this.currency = currency;
        this.amount = amount;
        this.television = television;
        this.socialMedia = socialMedia;
        this.radioFundRaisingDept = radioFundRaisingDept;
    }
    TelevisionFundRaisingDept television;
    SocialMediaFundRaisingDept socialMedia;
    RadioFundRaisingDept radioFundRaisingDept;

    public DisasterFundRaiser(Disaster disaster, String currency, long amount) {
        this.disaster = disaster;
        this.currency = currency;
        this.amount = amount;
    }
}
