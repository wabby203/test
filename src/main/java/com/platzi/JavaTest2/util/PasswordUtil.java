package com.platzi.JavaTest2.util;

import com.platzi.JavaTest2.util.SecurityLevel.SecurityLevel;

public class PasswordUtil {

    public static SecurityLevel.securityLevel assesPwd(String pwd)
    {
        if (pwd.length() < 8) {
            return SecurityLevel.securityLevel.WEEK;
        } else if (pwd.matches("[a-zA-Z]+")) {
            return SecurityLevel.securityLevel.WEEK;
        } else if (pwd.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.securityLevel.MEDIUM;
        }
        return SecurityLevel.securityLevel.STRONG;
    }

    public static boolean StringFases (String word) {

        if (word.trim().isEmpty() || word == null)
        {
            System.out.println("la cadena esta vacia ");
            return true;
        } else {
            System.out.println("se encontro al menos un caracter ");
            return false;
        }

    }

}
