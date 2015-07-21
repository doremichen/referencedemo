package com.adam.app.reference.demo;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    public static void main(String[] args) {
        ReferenceQueue<MyDate> queue = new ReferenceQueue<MyDate>();
        PhantomReference<MyDate> ref = new PhantomReference<MyDate>(new MyDate(), queue);
        System.gc();

    }

}
