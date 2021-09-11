package com.HomeWorks.java;

public class HomeWorkNumbers11To30ReverseManner {

	public static void main(String[] args) {
		for (int i = 11; i <= 30; i++) {
			isReverse(i);
		}
	}

	static void isReverse(int num) {
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

	}
}
