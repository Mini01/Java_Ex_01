package com.biz.ex01;

public class RndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index =0;
		int intSum =0;
		int intAvg =0;
		for( index = 0 ; index< 16 ; index++ ) {
		 int intNum =(int) (Math.random() * (100-50 +1)) + 50;
		 intSum += intNum;
		 System.out.println(intNum);
		 
		}
		
		intAvg = intSum / index;
		System.out.println("합계:" + intSum);
		System.out.println("평균:" + intAvg);
		
		
	}

}
