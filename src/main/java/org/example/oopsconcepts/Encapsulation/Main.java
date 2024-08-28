package org.example.oopsconcepts.Encapsulation;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.getFullName("Mithoon"));
        System.out.println(superClass.getFullName("Mithoon", 60));
    }
}
