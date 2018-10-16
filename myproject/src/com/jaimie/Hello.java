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
		
		Person j = new Person(43.6f, 1.6f);
//		j.weight = 43.6f;
//		j.height = 1.6f;
		System.out.println(j.bmi())	;
//		Person jaimie = new Person();
//		Person jacob = null;
//		jacob.hello();
		
		String name = "Hank";
		int english = 70;
		int math = 90;
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english + math)/2 + "\t");
		
	
		
		
		
		
		
		
		
				
		

	}

}
