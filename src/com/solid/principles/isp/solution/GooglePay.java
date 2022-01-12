package com.solid.principles.isp.solution;

public class GooglePay implements UPIPayments, CashBackManager {

    @Override
    public void getCashBackAsCreditBalance() {
        //this features is there in gpay
    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

}
