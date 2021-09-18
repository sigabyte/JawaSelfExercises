package com.SelfExercise.java;

public class SelfExercise47PrintPrimeNumberFrom2To20 {

	public static void main(String[] args) {
		
		for(int i=2; i<=20;i++) {
			
			if(isprime(i)==true) {
			System.out.println(i);
			}
		}

	}
	
	static boolean isprime(int num) {
		
		int divisor=0;
		
		for (int i=2; i<num;i++) {
			if(num%i==0) {
				divisor++;
			}
		}
		
		if(divisor==0) {
			return true;
		}else {
			return false;
		}
	}

}
