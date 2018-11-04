package com.jaimie;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		System.out.println("Please enter a temperature(Celsius):");
		Scanner temperature = new Scanner(System.in);
		double c = temperature.nextDouble();
		Temperature temp = new Temperature(c);
		
		System.out.printf("%.1f C = %.1f F\n", 
				temp.celsius, temp.fahrenheit());
	}
}

