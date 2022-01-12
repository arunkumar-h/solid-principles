package com.solid.principles.isp;

/*
* Interface Seggregation Principle:
*   Larger Interfaces splits into smaller ones and the implementation classes uses only methods that are required.
*   Do not force the Client to use the methods that are not required to them.
*
*   In below example say GPay, PhonePe and PayTM are different UPIPayment clients.
*   GPay provides CashBackAsCredit balance feature, this class implementing below interface makes sense.
*   However, PayTM or PhonePe doesn't provide this feature and implementing below interface forces them to provide
*   empty implementation which breaks Interface Seggregation Principle.
*
*   Solution: Split Larger Interfaces to smaller ones
*
*/
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCreditBalance();
}
