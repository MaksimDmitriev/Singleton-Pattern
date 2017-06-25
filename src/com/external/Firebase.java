package com.external;

public class Firebase {

    private static final Firebase INSTANCE = new Firebase();
    private static final SomeClass SOME_CLASS = new SomeClass("Firebase");

    private Firebase() {
        System.out.println("Firebase()");
    }

    public static Firebase getInstance() {
        return INSTANCE;
    }

    public static SomeClass getSomeClass() {
        return SOME_CLASS;
    }
}
