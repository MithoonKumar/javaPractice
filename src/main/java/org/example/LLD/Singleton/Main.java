package org.example.LLD.Singleton;

// The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. This is useful for scenarios where you want to restrict object creation to a single instance, such as a configuration manager or a database connection pool.
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); // True

    }
}
