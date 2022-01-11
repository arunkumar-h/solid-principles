package com.solid.principles.srp;

/*
* Single Responsibility Principle: There should be single reason to change the class
* Notice here, BankService deals with LoanService, Printing Passbook, Sending OTP notification,
* along with Banking activities like deposit/withdraw which breaks design principle.
*
* If there's any change in OTP notification (say via mobile) we need to change this class
* If there's any change in Lending Loan (say via Gold) we need to change this class
*
* Solution: Break into multiple classes, Scatter/ Separate the work and dedicate only one functionality for one class
*/

public class BankService {

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if (medium.equals("mobile")) {
            //write logic using twillio API
        }
    }

    public void printPassbook() {
        //update transaction info in passbook
    }
}
