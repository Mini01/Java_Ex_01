package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = (int) (Math.random() * (100-50 +1)) + 50;
		int intEng = (int) (Math.random() * (100-50 +1)) + 50;
		int intMath = (int) (Math.random() * (100-50 +1)) + 50;
		int intSci = (int) (Math.random() * (100-50 +1)) + 50;
		int intHis = (int) (Math.random() * (100-50 +1)) + 50;
		
		
		int intSum = intKor + intEng + intMath + intSci + intHis;
		float floatAvg = (float)intSum / 5;
		System.out.println(" 국어:" + intKor);
		System.out.println(" 영어:" + intEng);
		System.out.println(" 수학:" + intMath);
		System.out.println(" 과학:" + intSci);
		System.out.println(" 역사:" + intHis);
		System.out.println(" 총점:" + intSum);
		System.out.println(" 평균:" + floatAvg);
				

	}

}
