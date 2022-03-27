package com.imoving.commonActions;

import java.util.Random;

public class GeneratingNumbers {
    public String generate10RandomNumbers() {
        Random rnd = new Random();
        char[] digits = new char[10];
        digits[0] = (char) (rnd.nextInt(9) + '1');
        for (int i = 1; i < digits.length; i++) {
            digits[i] = (char) (rnd.nextInt(10) + '0');
        }
        return String.valueOf(digits);
    }
}
