package com.SelfExercise.java;

public class SelfExercise27Arrays5 {
	public static void main(String[] args) {
		
		int data[] = { 3, 6, 9, 2, 4 };

		int min = data[0];

		for (int i = 0; i < data.length; i++) {

			if (data[0] < min) {
				min = data[0];

			}

		}
		System.out.println(min);

	}

}
