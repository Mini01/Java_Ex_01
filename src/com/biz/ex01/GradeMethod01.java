package com.biz.ex01;

public class GradeMethod01
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor =0;
		int intEng =0;
		int intMath =0;
		int intSci =0;
		
		intKor = 53;
		intEng = 77;
		intMath = 95;
		intSci = 100;
		
		float intSum = gradeSum(intKor,intEng,intMath,intSci);
		System.out.println(intSum);

	}
	
	public static float gradeSum(float intKor, float intEng, float intMath, float intSci) {
		float intSum = (intKor + intEng + intMath + intSci) /4;
		return intSum;
		
	}

}
