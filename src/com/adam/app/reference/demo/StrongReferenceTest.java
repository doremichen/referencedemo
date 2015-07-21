/**
 * this is demo
 */
package com.adam.app.reference.demo;

public class StrongReferenceTest {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        ReferenceTest.drainMemory();
//        System.gc();

    }

}
