package com.external;

// The static class definition LazyHolder within it is not initialized until the JVM determines
// that LazyHolder must be executed

// lazy initialization
// Thread-safe
public class Facebook {

    private static final SomeClass SOME_CLASS = new SomeClass("Facebook");

    private Facebook() {
        System.out.println("Facebook()");
    }

    public static class LazyHolder {
        public static final Facebook INSTANCE = new Facebook();
    }

    public static Facebook getInstance() {
        return LazyHolder.INSTANCE;
    }

    public static SomeClass getSomeClass() {
        return SOME_CLASS;
    }

}
