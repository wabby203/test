package com.platzi.JavaTest2.RomanNumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void convert_arabic_to_roman() {
        assertEquals("III", RomanNumerals.arabicToRoman(3));
    }
}