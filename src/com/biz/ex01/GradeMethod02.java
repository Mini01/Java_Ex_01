package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Kor = 0;
		int Eng = 0;
		int Mat = 0;
		int Sci = 0;
		
		Kor = 50;
		Eng = 40;
		Mat = 70;
		Sci = 100;
		// main에서 계산할 총점을 gradeSum()한테
		// 대신 시키기
		int intSum = gradeSum(Kor,Eng,Mat,Sci);
		System.out.println(intSum /4);
			

	}
	public static int gradeSum(int Kor, int Eng, int Mat, int Sci) {
		int intSum = (Kor + Eng + Mat + Sci);
		return intSum;
	}

}
