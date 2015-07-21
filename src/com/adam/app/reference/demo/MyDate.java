/**
 * this is demo
 */
package com.adam.app.reference.demo;

import java.util.Date;

public class MyDate extends Date {

    /**
     * constructor
     */
    public MyDate() {
        
    }

    @Override
    protected void finalize() throws Throwable {
        
        super.finalize();
        
        System.out.println("obj[Date : " + this.getTime() + " ] is gc");
    }

    @Override
    public String toString() {
        
        return "Date: " + this.getTime();
    }
    
    
}
