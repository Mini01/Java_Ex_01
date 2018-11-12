package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Kor;
		int Eng;
		int Math;
		
		Kor=50;
		Eng=70;
		Math=90;
		
		int intSum = GradeSum(Kor,Eng,Math);
		System.out.println(intSum);
		
		
			
		

	}
	
	
	
	public static int GradeSum(int Kor, int Eng, int Math) {
		int intSum = Kor + Eng +  Math;
				return  intSum;
				
			
				
		
		
	}

}
