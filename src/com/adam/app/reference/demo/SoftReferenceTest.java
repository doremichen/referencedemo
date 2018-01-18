/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: SoftReferenceTest.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

    public static void main(String[] args) {
        SoftReference<MyDate> ref = new SoftReference<MyDate>(new MyDate());
        Utils.print("before drain memory ref.get = " + ref.get());
        ReferenceTest.drainMemory();
        Utils.print("after drain memory ref.get = " + ref.get());

    }

}
