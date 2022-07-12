package com.platzi.JavaTest2.FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int num) {

    return num % 3 == 0 && num % 5 == 0?"FizzBuzz":num % 5 == 0?"Buzz":num % 3 == 0?"Fizz":String.valueOf(num);

    }
}
