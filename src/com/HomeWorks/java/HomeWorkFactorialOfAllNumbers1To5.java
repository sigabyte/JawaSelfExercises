package com.HomeWorks.java;

public class HomeWorkFactorialOfAllNumbers1To5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			isFactorial(i);
		}

	}

	static void isFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
