package com.platzi.JavaTest2.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzzTest = new FizzBuzz();
    @Test
    public void number_divicible_by_3() {

        assertEquals("Fizz",fizzBuzzTest.fizzBuzz(6 ));
    }

    @Test
    public void number_divicible_by_5() {
        assertEquals("Buzz",fizzBuzzTest.fizzBuzz(10 ));
    }

    @Test
    public void number_divicible_by_3_and_by_5() {
        assertEquals("FizzBuzz",fizzBuzzTest.fizzBuzz(30 ));
    }

    @Test
    public void no_es_divicible_retorna_mismo_valor() {
        assertEquals("16",fizzBuzzTest.fizzBuzz(16 ));
    }
}