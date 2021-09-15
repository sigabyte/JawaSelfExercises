package com.SelfExercise.java;

public class SelfExercise45Constructor {
	public static void main(String[] args) {

		Grocery v1 = new Grocery("apple", 120, 2);
		Grocery v2 = new Grocery("Pear", 80, 3);

		v1.printName();
		v1.calcPrice();
		System.out.println();
		v2.printName();
		v2.calcPrice();

	}

}

class Grocery {

	String name;
	int price;
	int weight;

	Grocery(String nameFromUser, int priceFromUser, int weightFromUser) {

		name = nameFromUser;
		price = priceFromUser;
		weight = weightFromUser;
	}

	void printName() {
		System.out.println(name);
	}

	void calcPrice() {
		System.out.println(price * weight);

	}

}
