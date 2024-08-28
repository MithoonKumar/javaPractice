package org.example.oopsconcepts.Encapsulation;

public class SuperClass {
    String getFullName(String name){
        return name + " Keshari";
    }

    protected String getFullName(String name, int age){
        return name + " Keshari" + " " + age;
    }
}
