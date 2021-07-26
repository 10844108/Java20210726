package com.study.day05;

public class HelloBMIResult {

	public static void main(String[] args) {
		BMI bmi=new BMI("ZH",181,65);
		BMIResult bmiResult =new BMIResult(bmi);
		System.out.println(bmiResult.getResult());
		//觀察 bmi(name, height, weight, bmi), bmiResult 的物件屬性/變數資料
		System.out.println(bmiResult);
	
	}

}
