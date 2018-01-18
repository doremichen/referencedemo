/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ReferenceTest.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTest {
    /**
     * constructor
     */
    public ReferenceTest() {
        
    }
    
    //drain a lot of memory
    public static void drainMemory() {
        
        try {
            
            List<ReferenceTest> heap = new ArrayList<ReferenceTest>(100000);
            
            while(true) {
                heap.add(new ReferenceTest());
            }
            
            
        } catch (OutOfMemoryError e) {
            
            Utils.print("out of memory");
            
        }
        
    }
}
