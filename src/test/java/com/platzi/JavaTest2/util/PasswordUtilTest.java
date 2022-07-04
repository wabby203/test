package com.platzi.JavaTest2.util;

import com.platzi.JavaTest2.util.SecurityLevel.SecurityLevel;
import org.junit.Assert;
import org.junit.Test;

import static com.platzi.JavaTest2.util.SecurityLevel.SecurityLevel.securityLevel.WEEK;
import static com.platzi.JavaTest2.util.SecurityLevel.SecurityLevel.securityLevel.MEDIUM;
import static com.platzi.JavaTest2.util.SecurityLevel.SecurityLevel.securityLevel.STRONG;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    PasswordUtil passwordUtil = new PasswordUtil();
    public String pwd = "jahsfb45_2&/";

    @Test
    public void week_when_has_less_than_8_letters() {

        assertEquals(WEEK, passwordUtil.assesPwd(pwd));
        //throw new RuntimeException("la contraseña es corta, ingrese 8 o mas caracteres");

    }

    @Test
    public void week_when_has_only_numbers() {

        assertEquals(WEEK, passwordUtil.assesPwd(pwd));
        //throw new RuntimeException("la contraseña es debil, igrese numeros y symbolos ");
    }

    @Test (expected = IllegalArgumentException.class)
    public void medium_when_has_letters_and_numbers() {


        passwordUtil.assesPwd(pwd);


    }

    @Test
    public void strong_when_has_letters_numbers_and_sign() {

        assertEquals(STRONG, passwordUtil.assesPwd(pwd));
      //  throw new RuntimeException("la contraseña es fuerte");
    }

    @Test (expected = IllegalArgumentException.class)
    public void medium_when_has_letters_and_numbers_and_undercore() {

        passwordUtil.assesPwd("leet45");

    }

    @Test
    public void String_is_not_empty() {
        assertTrue(passwordUtil.StringFases(" "));
    }

    @Test
    public void String_is_empty() {
        assertTrue(passwordUtil.StringFases("      "));
    }

    @Test
    public void String_is_null() {
        assertTrue(passwordUtil.StringFases(""));
    }
}