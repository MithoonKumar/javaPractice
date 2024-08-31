package org.example.LLD.FactoryMethodPattern;

// The Factory Method pattern defines an interface for creating objects, but the concrete subclasses decide which class to instantiate. It promotes loose coupling between the creator and the product classes.
public class Main {
    public static void main(String[] args) {

        Product concreteProductA = new ConcreteProductA();
        concreteProductA.create();

        Product concreteProductB = new ConcreteProductB();
        concreteProductB.create();

        PaymentMode paymentModeDirect = new PaymentMode() {
            @Override
            String CommonFeatures() {
                // TODO Auto-generated method stub
                System.out.println("Direct Payment method");
                return null;
            }
        };
        paymentModeDirect.CommonFeatures();

        PaymentMode paymentModeA = new PaymentModeA();
        paymentModeA.PerformTransaction(40);
        paymentModeA.CommonFeatures();

        PaymentMode paymentModeB = new PaymentModeB();
        paymentModeB.PerformTransaction(40);
        paymentModeB.CommonFeatures();

    }
}
