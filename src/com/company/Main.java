package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.print("Введите число Арабское/Римское от 1 до 10" + "\n");
        Scanner reader = new Scanner(System.in);
        System.out.print("Пример ввод 2 + 2/I + II: ");
        //ArabicNumeric arabicNumeric = new ArabicNumeric(reader);
        RomanNumeric romanNumeric = new RomanNumeric(reader);


    }
}
