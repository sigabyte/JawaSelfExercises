package com.SelfExercise.java;

public class SelfExercise02BloodDonation {
	public static void main(String[] args) {
		int age = 19, weight = 52;

		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("You are eligible");
			} else {
				System.out.println("You are under weight");
			}
		} else if (weight < 50) {
			System.out.println("You are not eligible");
		} else {
			System.out.println("You are too young to donate blood");
		}
	}
}
