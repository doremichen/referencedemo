/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: StrongReferenceTest.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

public class StrongReferenceTest {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        ReferenceTest.drainMemory();
        System.gc();

    }

}
