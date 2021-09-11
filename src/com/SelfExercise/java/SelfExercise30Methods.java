package com.SelfExercise.java;

import java.util.Scanner;

public class SelfExercise30Methods {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		printline('#', 20);
		

		System.out.println("Welcome to Odd / Even Tool");
		printline('-', 25);

		System.out.println("Please enter number to proceed");
		printline('-', 35);

		int num = sc.nextInt();
		printline('-', 8);
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
			printline('-', 8);
			
		} else {
			System.out.println(num + " is Odd");
			printline('-', 8);
		}

	}

	static void printline(char c, int length) {
		for(int i=1; i<=length;i++) {
		System.out.print(c);	
		}
		System.out.println();
	}

}
