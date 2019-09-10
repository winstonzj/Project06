package com.zj.java;


import com.zj.bean.Customer;

import java.util.ArrayList;

/**
 * @author ZJ
 * @date 9/8/2019 - 8:53 PM
 */
public class TemplatesTest {

    private static final Customer cust = new Customer();

    public static final int NUM = 1;

    public static final int NUM2 = 1;

    public static final String NATION = "CHINA";





    public static void main(String[] args) {
        System.out.println("Templates");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num = 1;
        System.out.println("num = " + num);

        String[] arr = new String[]{"Tom", "Jerry", "Li Lei", "Han Meimei"};

        for (String s : arr) {
            System.out.println("s = " + s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);

        for (Object o : list2) {

        }
    }

    public static void method1() {
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);

        if (list2 == null) {

        }

        if (list2 != null) {

        }

        if (list2 != null) {

        }

        if (list2 == null) {

        }


    }


}
