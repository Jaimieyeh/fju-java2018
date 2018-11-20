package com.jaimie;

public class Student {
	String name;
	int english;
	int math;

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}

	public void print(){
		System.out.println(name + "\t" + english + "\t" + math + "\t" +
	                       average() + highest());
			if(average() > 60){
			System.out.print("PASS");
			
			}else if(average()< 60){
			System.out.print("FAILED");
		}
	
	public int highest() {
		if (english > math){
			return english;
		}else{
			return math;
		}
		
	}
		
	}

	public int average() {
		return (math + english) / 2;
	}

}
