package com.jaimie;

public class Hello {

	public static void main(String[] args) {
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
