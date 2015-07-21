/**
 * this is demo
 */
package com.adam.app.reference.demo;

public class ImplicitGarbageRetrieve {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        date = null;
        ReferenceTest.drainMemory();

    }

}
