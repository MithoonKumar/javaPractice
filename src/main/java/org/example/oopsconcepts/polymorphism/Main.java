package org.example.oopsconcepts.polymorphism;

public class Main {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.getName("Arti"));
        System.out.println(superClass.getName("Arti", 18));

        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getName("Arti"));

    }
}
