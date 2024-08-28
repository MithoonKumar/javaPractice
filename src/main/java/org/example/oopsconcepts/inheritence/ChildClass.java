package org.example.oopsconcepts.inheritence;

public class ChildClass extends SuperClass {

    public ChildClass(String name) {
        super(name);
    }

    public String getExtendedName() {
       return  this.getName() + "keshari";
    }
}
