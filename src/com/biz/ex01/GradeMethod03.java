package com.biz.ex01;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor = (int) (Math.random() * (100-50 +1)) + 50;
		int intEng = (int) (Math.random() * (100-50 +1)) + 50;
		int intMath = (int) (Math.random() * (100-50 +1)) + 50;
		int intSci = (int) (Math.random() * (100-50 +1)) + 50;
		
		int intSum =gradeSum (intKor, intEng);
		intSum += gradeSum (intMath, intSci);
		System.out.printf("국어: %d, 영어: %d, 수학: %d, 과학:%d 합계=%d \n",intKor,intEng,intMath,intSci,intSum);
		// 평균을 비교적 정확히 계산하기 위해서
		// 총점을 float으로 변환하고
		// /4를 계산해서 표시
		System.out.println("평균:" +((float)+ intSum/4));

	}
	
	
	public static int gradeSum(int intKor,int intEng) {
		return intKor+intEng;
	}

}
