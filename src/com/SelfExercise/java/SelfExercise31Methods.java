package com.SelfExercise.java;

public class SelfExercise31Methods {
	public static void main(String[] args) {	
		//int ;
		
		for (int i = 2; i <=50; i++) {
			
			if (isPrime(i)==true) {
				System.out.println(i);
			}				
			}
					
		}
	static boolean isPrime(int num) {
		
		int divisor=0;

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
