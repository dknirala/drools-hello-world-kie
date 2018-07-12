package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

public final class Utility {
    private boolean test = true;

    public static List<String> getProductType(){
        return Arrays.asList("ABC","DDD","EEE");
    }

    public  static  boolean isCorrectProduct(String productName){
       //return getProductType().contains(productName);
        System.out.println("inside check");
        return true;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }
}

