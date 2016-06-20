package com.nazmul.bitmtrainer401.interestcalculator;

/**
 * Created by BITM Trainer 401 on 6/19/2016.
 */
public class InterestCalculator {
    private double principalAmount;
    private float interestRate;
    private float timePeriod;

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(float timePeriod) {
        this.timePeriod = timePeriod;
    }

    public double calculateTotalAmount(){

        double interestAmount=getInterestRate()*getTimePeriod();
        double totalAmount=interestAmount+getPrincipalAmount();
        return totalAmount;
    }
}
