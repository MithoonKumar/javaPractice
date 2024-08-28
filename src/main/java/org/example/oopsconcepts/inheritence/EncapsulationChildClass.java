package org.example.oopsconcepts.inheritence;

import org.example.oopsconcepts.Encapsulation.SuperClass;

public class EncapsulationChildClass extends SuperClass {

    public void CrossPackageTest(){
        //System.out.print(getFullName("Mithoon"));
        System.out.println(getFullName("Mithoon", 60));
    }
    public static void main(String[] args) {
        EncapsulationChildClass encapsulationChildClass = new EncapsulationChildClass();
        encapsulationChildClass.CrossPackageTest();
    }
}
