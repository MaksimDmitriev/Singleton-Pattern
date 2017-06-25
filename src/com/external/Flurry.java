package com.external;

public class Flurry {

    private static Flurry sInstance;
    private static final SomeClass SOME_CLASS = new SomeClass("Flurry");

    private Flurry() {
        System.out.println("Flurry()");
    }

    public static synchronized Flurry getInstance() {
        if (sInstance == null) {
            sInstance = new Flurry();
        }
        return sInstance;
    }

    public static SomeClass getSomeClass() {
        return SOME_CLASS;
    }
}
