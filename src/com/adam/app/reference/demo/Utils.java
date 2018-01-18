/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app.reference.demo;

/**
 * <h1>Utils</h1>
 * 
 * @autor AdamChen
 * @since 2018/1/18
 */
public final class Utils {
    
    private static final boolean ISLOG = true;
    
    public static void print(Object obj, String str) {
        if (ISLOG) {
            System.out.println(obj.getClass().getSimpleName() + " " + str);
        }
        
    }
    
    public static void print(String str) {
        if (ISLOG) {
            System.out.println(str);
        }
    }

}
