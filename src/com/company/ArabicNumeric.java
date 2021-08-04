package com.company;

import java.util.Scanner;

public class ArabicNumeric {
    int result;
    public  ArabicNumeric(Scanner reader) {

        String[]lineList =  reader.nextLine().split(" ");

        if (lineList.length > 1) {
            int num1 = Integer.parseInt(lineList[0]);
            int num2 = Integer.parseInt(lineList[2]);
            String operator = lineList[1];


                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        try {
                            throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                }

        }
        else {
            try {
                throw new Exception(" строка не является математической операцией");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println(result);

    }
}
