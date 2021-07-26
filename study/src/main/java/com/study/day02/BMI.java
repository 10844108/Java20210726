package com.study.day02;

//設計一個BMI類別物件
//需求 : 存放 人名 身高 體重 <-- 術性
//計算BMI值              <-- 方法
public class BMI {
	String name;   // 人名
	double height; // 身高
	double weight; // 體重
	//取得bmi的計算結果(計算結果也是回傳值是double)
	double getBmiValue(){
		//實作bmi的計算方式
		double bmi=weight/Math.pow(height/100, 2);
		//回傳(return)bmi的結果
		return bmi;
	}
}