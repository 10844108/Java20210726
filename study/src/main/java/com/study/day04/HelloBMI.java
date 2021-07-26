package com.study.day04;



public class HelloBMI {

	public static void main(String[] args) {
		BMI b1=new BMI("ZH",181,65);
		BMI b2=new BMI();
		b2.name="GJ";
		//b2.height=181;
		//b2.weight=70;
		b2.setHeight(186);
		b2.setWeight(70);
		System.out.println(b1.getBmiValue());
		double value=b2.getBmiValue();
		if(value>0) {
			System.out.println(b2.getBmiValue());
		}else {
			System.out.println("身高或體重的資料有問題");
		}
		
		
	}

}
