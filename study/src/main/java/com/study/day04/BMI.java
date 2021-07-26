package com.study.day04;

public class BMI {
	String name;
	private double height;
	private double weight;
	
	BMI(){
		
	}
	
	BMI(String name, double height, double weight){
		this.name=name;     //this. -->念成 "物件的"
		this.height=height;
		this.weight=weight;
	}
	
	//setter 的方法
	void setHeight(double height) {
		if(height>0)
		{
			this.height=height;
		}
	}
	void setWeight(double weight) {
		if(weight>0) {
			this.weight=weight;
		}
	}
	
	
	double getBmiValue() {
		double bmi=weight/Math.pow(height/100, 2);
		return bmi;
	}
}
