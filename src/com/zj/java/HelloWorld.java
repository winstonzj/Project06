package com.zj.java;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static final int INITIAL_SIZE = 0;

    public HelloWorld() {
    }

    public static void main(String[] args) {


        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        Date date = new Date();
        ArrayList<Object> list1 = new ArrayList<>();
        int e = 0;
        try {
            e = 1;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        list1.add(e);

        method1();

    }

    public static void method1() {
        System.out.println("method1");

    }
}
