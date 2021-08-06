package com.company;

import java.util.*;

public class RomanNumeric {
    int result;
    private final static TreeMap < Integer, String > romanString = new TreeMap<>();
    public RomanNumeric(Scanner reader) {

        String[] lineList = reader.nextLine().split(" ");

        if (lineList.length < 3) {
            String roman1 = lineList[0];
            String operator = lineList[1];
            String roman2 = lineList[2];

            Dictionary<String, Integer> romanNumDict = new Hashtable<>();
            romanNumDict.put("I", 1);
            romanNumDict.put("II", 2);
            romanNumDict.put("III", 3);
            romanNumDict.put("IV", 4);
            romanNumDict.put("V", 5);
            romanNumDict.put("VI", 6);
            romanNumDict.put("VII", 7);
            romanNumDict.put("VIII", 8);
            romanNumDict.put("IX", 9);
            romanNumDict.put("X", 10);

            romanString.put(1, "I");
            romanString.put(4, "IV");
            romanString.put(5, "V");
            romanString.put(9, "IX");
            romanString.put(10, "X");
            romanString.put(40, "XL");
            romanString.put(50, "L");
            romanString.put(90, "XC");
            romanString.put(100, "C");

            int romanInt1 = romanNumDict.get(roman1);
            int romanInt2 = romanNumDict.get(roman2);

            if (romanInt1 < romanInt2) {
                try {
                    throw new Exception("  римской системе нет отрицательных чисел");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else {
                switch (operator) {
                    case "+":
                        result = romanInt1 + romanInt2;
                        break;
                    case "-":
                        result = romanInt1 - romanInt2;
                        break;
                    case "*":
                        result = romanInt1 * romanInt2;
                        break;
                    case "/":
                        result = romanInt1 / romanInt2;
                        break;
                    default:
                        try {
                            throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                }

                System.out.println(toRomanNumber(result));
            }

        } else {

            try {
                throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    static String toRomanNumber(int number) {

        int i = romanString.floorKey(number);

        if (number == i) {
            return romanString.get(number);
        }
        return romanString.get(i) + toRomanNumber(number - i);
    }

}
