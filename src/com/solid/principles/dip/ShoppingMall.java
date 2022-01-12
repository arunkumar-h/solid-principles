package com.solid.principles.dip;

/*
 * Dependency Inversion Principle:
 *   It states that we must use abstraction (Abstract classes and Interfaces) instead of concrete implementations.
 *   High level modules should not depend on the Low level modules but both should depend on Abstraction.
 *
 *   In below example, say we need to do payment via DebitCard, the instance is tightly coupled to the class ShoppingMall.
 *   Say there is some issue with the debit card and you need to do payment via CreditCard, things will go for a toss here.
 *   Need to change the main ShoppingMall class and replace DebitCard with CreditCard everywhere.
 *
 *   Solution: Create a common CardPayment interface which will be implemented by both CreditCard and DebitCard
 *   Use this common interface in the business logice and inject whichever method is required at run time.
 *
 */
public class ShoppingMall {

    private DebitCard debitCard;
    private CreditCard creditCard;

    ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.purchaseItem(52000);
    }

    public void purchaseItem(long amount) {
        debitCard.doTransaction(amount);
    }
}
