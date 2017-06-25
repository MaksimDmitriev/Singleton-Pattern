package com.client;

import com.external.AppsFlyer;
import com.external.Facebook;
import com.external.Firebase;
import com.external.Flurry;

/*
    Important points to consider when implementing the Singleton pattern:
      1. Lazy initialization and performance
      2. Thread safety

 */
class Main {

    // TODO: http://literatejava.com/jvm/fastest-threadsafe-singleton-jvm/
    // finish
    public static void main(String[] args) {
        AppsFlyer.getSomeClass();
        Facebook.getSomeClass();
        Firebase.getSomeClass();
        Flurry.getSomeClass();
    }
}
