package org.example.oopsconcepts.inheritence;

public class Main {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Arti");
        String name = childClass.getExtendedName();
        System.out.println(name);
    }
}
