package com.SelfExercise.java;

public class SelfExercise44PrimeNumber2To450 {

	public static void main(String[] args) {

		for (int i = 2; i <= 450; i++) {
			
			if(isPrime(i)==false) {
			System.out.println(i);
			}
		}

	}

	static boolean isPrime(int num) {
		int divisor = 0;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
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
