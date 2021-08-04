package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Input name: ");
        ArabicNumeric num = new ArabicNumeric(reader);
        //RomanNumeric roman = new RomanNumeric(reader);
    }
}
