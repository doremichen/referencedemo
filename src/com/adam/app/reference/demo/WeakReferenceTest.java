/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: WeakReferenceTest.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */
package com.adam.app.reference.demo;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

    public static void main(String[] args) {
       WeakReference<MyDate> ref = new WeakReference<MyDate>(new MyDate());
       Utils.print("before GC ref.get = " + ref.get());
       System.gc();
       Utils.print("after GC ref.get = " + ref.get());
    }

}
