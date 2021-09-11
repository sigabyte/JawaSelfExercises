package com.SelfExercise.java;

public class SelfExercise32CheckNumberPalindrome {

	public static void main(String[] args) {
		for (int i = 2; i <= 50; i++) {
			if (isPalindrome(i) == true) {
				System.out.println(i);
			}
		}
	}

	static boolean isPalindrome(int num) {

		// i swapped the number :)
		int c = num;
		int reverse =0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		if (c == reverse) {
			return true;
		} else {
			return false;
		}

	}

}
