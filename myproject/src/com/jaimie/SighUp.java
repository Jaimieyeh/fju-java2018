package com.jaimie;

import java.util.Scanner;

public class SighUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you 18? (y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("Y");
		
		
	}

}
