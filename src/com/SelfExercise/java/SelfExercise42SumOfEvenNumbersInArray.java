package com.SelfExercise.java;

public class SelfExercise42SumOfEvenNumbersInArray {
	public static void main(String[] args) {
		
		int data[] = { 5, 9, 4, 5, 4, };
		int sum=0;
		
		for(int i=0;i<data.length;i++) {
			
			if(data[i]%2==0) {
			sum=sum+data[i];
			}
		}
		
		System.out.println(sum);
	}

}
