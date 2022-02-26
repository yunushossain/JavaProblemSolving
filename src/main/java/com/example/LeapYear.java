package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2016;

        isLeapYear(year);
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            return true;
        }

        return false;

    }

}
