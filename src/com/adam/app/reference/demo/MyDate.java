/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: MyDate.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

import java.util.Date;

public class MyDate extends Date {

    /**
     * constructor
     */
    public MyDate() {
        Utils.print(this, "Construct Mydata");
    }

    @Override
    protected void finalize() throws Throwable {
        
        super.finalize();
        
        Utils.print(this, "[Date : " + this.getTime() + " ] is gc");
    }

    @Override
    public String toString() {
        
        return "Date: " + this.getTime();
    }
    
    
}
