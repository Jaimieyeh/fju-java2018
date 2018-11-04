package com.jaimie;

public class Temperature {
	double celsius;
	
	public Temperature(double celsius){
		this.celsius = celsius;
		}
	public double fahrenheit(){
		double fahrenheit = (celsius*(9/5.0)+32);
		return fahrenheit;
		
	}
	
}
