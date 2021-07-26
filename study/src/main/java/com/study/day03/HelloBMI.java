package com.study.day03;

public class HelloBMI {

	public static void main(String[] args) {
		BMI b1=new BMI("ZH",181,65);
		BMI b2=new BMI("GJ", 186, 70);
		System.out.println(b1.getBmiValue());
		System.out.println(b2.getBmiValue());

	}

}
