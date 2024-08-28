package org.example.oopsconcepts.polymorphism;

public class SuperClass {
    public String getName(String name){
        return name;
    }
    public String getName(String name, int age){
        return name+" "+age;
    }
}
