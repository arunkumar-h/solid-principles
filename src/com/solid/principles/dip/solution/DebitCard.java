package com.solid.principles.dip.solution;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("Payment using Debit Card.");
    }

}
