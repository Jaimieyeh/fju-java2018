package com.jaimie;

import java.util.Scanner;

public class Member {
	boolean adult;
	int age;
	String name;
	String nickName;
	public Member(boolean adult) { 
		this.adult = adult;
	}
	public Member(int age, String name, String nickName) {
		this.age = age;
		this.name = name;
		this.nickName = nickName;
	}
	public void startInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your age?");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your name?");
		name = scanner.nextLine();
		System.out.println("Your nick name?");
		nickName = scanner.nextLine();
		System.out.println(age + "/" + name + "/" + nickName);
		
		
		
		
	}
	
	

	

}
