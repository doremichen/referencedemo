/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: PhantomReferenceTest.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    public static void main(String[] args) {
        ReferenceQueue<MyDate> queue = new ReferenceQueue<MyDate>();
        PhantomReference<MyDate> ref = new PhantomReference<MyDate>(new MyDate(), queue);
        Utils.print("before GC ref = " + ref.get());
        System.gc();
        Utils.print("after GC ref = " + ref.get());

    }

}
