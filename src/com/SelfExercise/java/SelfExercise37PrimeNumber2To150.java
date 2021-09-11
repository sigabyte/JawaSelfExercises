package com.SelfExercise.java;

public class SelfExercise37PrimeNumber2To150 {
	public static void main(String[] args) {

		for (int i = 2; i <= 150; i++) {

			if (isPrime(i) == false) {
				System.out.print(i);
				
			}
		}

	}

	static boolean isPrime(int num) {

		int divisor = 0;

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				divisor++;
			}
		}
		if (divisor == 0) {
			return false;
		} else {
			return true;
		}
	}

}
