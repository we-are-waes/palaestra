package com.waes.palaestra.romannumerals;

public class RomanNumeralsConverter {

    public static String convert(int number) {
        if (number == 9) return "IX";
        if (number == 4) return "IV";

        var result = new StringBuilder();

        if (number >= 10) {
            result.append("X");
            number-=10;
        }

        if (number >= 5) {
            result.append("V");
            number-=5;
        }

        while (number >= 1) {
            result.append("I");
            number-=1;
        }

        return result.toString();
    }

}
