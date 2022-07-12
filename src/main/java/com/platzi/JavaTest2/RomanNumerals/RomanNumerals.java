package com.platzi.JavaTest2.RomanNumerals;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    enum RomanNumeral {
        M(1000),CM(900),D(500),CD(400),
        C(100),XC(90),L(50),XL(40),
        X(10),IX(9),V(5),IV(4),
        I(1);

        private int value;
        RomanNumeral(int Value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public static List<RomanNumeral>

        getRomanNumerals() {
            return Arrays.asList(RomanNumeral.values());
        }
    }

        public static String arabicToRoman(int num){

            StringBuilder collator = new StringBuilder();
            List<RomanNumeral> romanNumerals= RomanNumeral.getRomanNumerals();







                String numRoman = "";
            if (num > 0 && num < 4){
                for (int i=0; i<num; i++) {
                    numRoman += "I";
                }
            }



            return numRoman;
        }
}
