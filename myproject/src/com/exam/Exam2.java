package com.exam;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		
		System.out.println("Your guess ");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			
			if(a == secret){
				System.out.println("Great! The number is " + secret);
				break;
			}else if(a < secret){
				System.out.println("higher");
			}else if(a > secret){
				System.out.println("lower");
			}
		}
		
		
		

	}

}
