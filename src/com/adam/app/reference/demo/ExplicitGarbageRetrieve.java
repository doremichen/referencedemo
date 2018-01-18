/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ExplicitGarbageRetrieve.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

public class ExplicitGarbageRetrieve {

    public static void main(String[] args) {
             
        MyDate date = new MyDate();
        date = null;
        System.gc();

    }

}
