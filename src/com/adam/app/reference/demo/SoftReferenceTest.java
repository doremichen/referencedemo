/**
 * this is demo
 */
package com.adam.app.reference.demo;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

    public static void main(String[] args) {
        SoftReference<MyDate> ref = new SoftReference<MyDate>(new MyDate());
        System.out.println("ref.get = " + ref.get());
        ReferenceTest.drainMemory();
        System.out.println("ref.get = " + ref.get());

    }

}
