package com.study.day02;

public class HelloBMI{
	public static void main(String[] args) {
		BMI b1= new BMI();
		b1.name="ZH";
		b1.height=181;
		b1.weight=65;
		
		BMI b2=new BMI();
		b2.name="GJ";
		b2.height=186;
		b2.weight=70;
		System.out.println(b1.getBmiValue());
		System.out.println(b2.getBmiValue());
	}
	

}
