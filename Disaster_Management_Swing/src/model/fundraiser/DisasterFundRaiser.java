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
    private long targetAmount;
    private long amountRaisedSoFar;

    public Disaster getDisaster() {
        return disaster;
    }

    public void setDisaster(Disaster disaster) {
        this.disaster = disaster;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(long targetAmount) {
        this.targetAmount = targetAmount;
    }

    public long getAmountRaisedSoFar() {
        return amountRaisedSoFar;
    }

    public void setAmountRaisedSoFar(long amountRaisedSoFar) {
        this.amountRaisedSoFar = amountRaisedSoFar;
    }

    public TelevisionFundRaisingDept getTelevision() {
        return television;
    }

    public void setTelevision(TelevisionFundRaisingDept television) {
        this.television = television;
    }

    public SocialMediaFundRaisingDept getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMediaFundRaisingDept socialMedia) {
        this.socialMedia = socialMedia;
    }

    public RadioFundRaisingDept getRadioFundRaisingDept() {
        return radioFundRaisingDept;
    }

    public void setRadioFundRaisingDept(RadioFundRaisingDept radioFundRaisingDept) {
        this.radioFundRaisingDept = radioFundRaisingDept;
    }

    public DisasterFundRaiser() {
    }

    public DisasterFundRaiser(Disaster disaster, String currency, long amount, TelevisionFundRaisingDept television, SocialMediaFundRaisingDept socialMedia, RadioFundRaisingDept radioFundRaisingDept) {
        this.disaster = disaster;
        this.currency = currency;
        this.targetAmount = amount;
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
        this.targetAmount = amount;
    }
}
