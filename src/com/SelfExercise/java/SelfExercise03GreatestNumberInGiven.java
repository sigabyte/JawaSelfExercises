package com.SelfExercise.java;
// find maximum number among three given number

public class SelfExercise03GreatestNumberInGiven {
	public static void main(String[] args) {
		int num1 = 300, num2 = 300, num3 = 300, num4 = 300;

		if (num1 == num2 && num1 == num3 && num1 == num4 && num2 == num3 && num2 == num4 && num3 == num4) {
			System.out.println("you netered same numbers. please enter different numbers");
		} else if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println(num1 + " is the gtreatest number");
		} else if (num2 > num3 && num2>num4) {
			System.out.println(num2 + " is the greatest number");
		} else if (num3>num4){
			System.out.println(num3 + " is the greatest number");
		}else {
			System.out.println(num4 + " is the greatest number");
		}
	}

}
