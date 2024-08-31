package org.example.LLD.Singleton;

public class Singleton {

    private static Singleton singleton;

    public Singleton() {
        // Private constructor
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}