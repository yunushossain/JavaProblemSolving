package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Swapping_values {

    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        System.out.println("before swapping values are :" + a + "," + b);
        a = a + b; // 17
        b = a - b; // 8
        a = a - b; // 9

        System.out.println("after swapping values are :" + a + "," + b);

    }
}
