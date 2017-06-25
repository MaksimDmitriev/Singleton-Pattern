package com.external;

// No lazy initialization
// Thread-safe
public class AppsFlyer {

    public static final AppsFlyer INSTANCE = new AppsFlyer();

    // TODO: what if non-final or initialized in the static init block?
    private static final SomeClass SOME_CLASS = new SomeClass("AppsFlyer");
    /*
    static {

    }
    */

    private AppsFlyer() {
        System.out.println("AppsFlyer()");
    }

    public static SomeClass getSomeClass() {
        return SOME_CLASS;
    }
}
