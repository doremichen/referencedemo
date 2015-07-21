package com.adam.app.reference.demo;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

    public static void main(String[] args) {
       WeakReference<MyDate> ref = new WeakReference<MyDate>(new MyDate());
       System.gc();
       System.out.println("ref.get = " + ref.get());
    }

}
