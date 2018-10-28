package com.jaimie;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean yes = number >=-3&& number<=5;
		System.out.println(yes);
		
	}
}
		

	


