package org.example.oopsconcepts.abstraction;

public class Main {

    public static void main(String[] args) {
        baseInterface baseInterface1 = new firstImpl();
        baseInterface1.eat();
        baseInterface baseInterface2 = new secondImpl();
        baseInterface2.eat();

        AbtractClassExtension abtractClassExtension = new AbtractClassExtension();
        System.out.println(abtractClassExtension.GetFullName("Arti"));
        System.out.println(abtractClassExtension.GetYourTrueAge(30));
    }
}
