package com.jaimie;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		/*float n = 11.56f;
		String nick = "jaimie";
		System.out.printf("your age: %.2f\nyour name: %s\n", n, nick);*/
		
		
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		int a = secret;
		Scanner guess = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = guess.nextInt();
		
		while(a > num ){
			System.out.println();
			
		}
		
		
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name");
		String name = scanner.nextLine();
		System.out.println(name);
		
		/*short age = 18;
		int height = 160;
		float weight = 43.6f;
		int schoolYear = 107;
		String name = "Jaimie Yeh";
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(schoolYear);*/
		
		System.out.println(3 <= 5);
		
		
		Person j = new Person(43.6f, 1.6f);
//		j.weight = 43.6f;
//		j.height = 1.6f;
		System.out.println(j.bmi())	;
//		Person jaimie = new Person();
//		Person jacob = null;
//		jacob.hello();
		
		Student stu = new Student("Hank", 70, 90);
//		stu.name = "Hank";
//		stu.english = 70;
//		stu.math = 90;
		stu.print();
		
	}

}
