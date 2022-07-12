package com.platzi.JavaTest2.util;

public class DateUtil {
    public static boolean isLeapYear(int year){
        //si el residuo de el año dividido por 400 es 0

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
