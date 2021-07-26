package com.study.day05;

//取得 BMI 結果:過重 過輕 正常
//設計組合:組合
public class BMIResult {
	private String result;
	@Override
	public String toString() {
		return "BMIResult [result=" + result + ", bmi=" + bmi + "]";
	}

	private BMI bmi;
	
	public String getResult() {
		return result;
	}

	public BMIResult( BMI bmi) {
		this.bmi = bmi;
		double bmiValue = this.bmi.getBmi();
		if(bmiValue>23) {
			result="過胖";
		}else if(bmiValue<18){
			result="過輕";
		}else {
			result="正常";
		}
	}
}
