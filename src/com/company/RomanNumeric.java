package com.company;

import java.util.*;

public class RomanNumeric {
    public  RomanNumeric(Scanner reader) {
        Dictionary romanNumDict = new Hashtable();
        romanNumDict.put("I", 1);
        romanNumDict.put("IV", 4);
        romanNumDict.put("V", 5);
        romanNumDict.put("IX", 9);
        romanNumDict.put("X", 10);
        romanNumDict.put("XL", 40);
        romanNumDict.put("L", 50);
        romanNumDict.put("XC", 90);
        romanNumDict.put("C", 100);


        System.out.println(romanNumDict);



    }

}
