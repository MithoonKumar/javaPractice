package org.example.LLD.ObserverPattern;

// The Observer pattern defines a one-to-many dependency between objects, ensuring that when one object changes state, its dependents are notified and updated automatically. This is widely used in event handling systems.
public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("Arti");
        Observer observer2 = new ConcreteObserver("Jyoti");

        Subject subject = new Subject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.setState("Sister");
    }
}
