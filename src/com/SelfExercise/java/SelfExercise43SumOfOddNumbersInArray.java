package com.SelfExercise.java;

public class SelfExercise43SumOfOddNumbersInArray {
	public static void main(String[] args) {
		int data[] = { 8, 5, 9, 20, 22, 25, 7, 3 };
		int sum = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i] % 2 == 1) {
				sum = sum + data[i];
			}
		}
		System.out.println(sum);
	}

}
