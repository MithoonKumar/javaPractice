package org.example.LLD.FactoryMethodPattern;

abstract public class PaymentMode {

    abstract String CommonFeatures();

    public void PerformTransaction(int account) {
        System.out.println("Payment done for " + account);
    }

}
