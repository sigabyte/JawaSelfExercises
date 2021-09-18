package com.SelfExercise.java;

public class SelfExercise46Constructor {
	public static void main(String[] args) {
		
		pharmacy p1 =new pharmacy("Zithromax", 10, 30);
		pharmacy p2=new pharmacy("Ciprofloxacin", 15, 40);
		p1.printName();
		p1.printdose();
		p1.printPrice();
		System.out.println("=============");
		
		//p2.printName();
		//p2.printdose();
		//p2.printPrice();

	}

}

class pharmacy {

	String name;
	int dose;
	int price;

	pharmacy(String nameFromUser, int doseFromUser, int priceFromUser) {

		name=nameFromUser;
		dose=doseFromUser;
		price=priceFromUser;
		
		System.out.println(name+price);
		

	}
	
	void printName() {
		System.out.println(name);
	}
	
	void printPrice() {
		System.out.println(price+"$");
	}
	
	void printdose() {
		System.out.println(dose+"ml");
	}

}
