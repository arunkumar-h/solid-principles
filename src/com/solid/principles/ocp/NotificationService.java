package com.solid.principles.ocp;

/*
 * Open-Closed Principle:
 *   This principle states that according to new requirements the module should be open for extension
 *   but close for modification
 *
 * If there's new notification say via Whatsapp, we need to modify this class (for every new type of notification)
 * Module/Class should be open for extension but not modification -
 *
 * Solution: via dedicated Interfaces
 */
public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if (medium.equals("mobile")) {
            //write logic using twillio API
        }
    }

}
