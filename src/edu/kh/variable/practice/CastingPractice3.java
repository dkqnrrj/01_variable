package edu.kh.variable.practice;

import java.util.Scanner;



public class CastingPractice3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어 : " );
		double input1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("영어 : " );
		double input2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("수학 : " );
		double input3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println();
		
		System.out.printf("총점 : %0.f\n", input1 + input2 + input3);
		
		
		System.out.println();
		
		
		System.out.printf("평균 : %0.f\n", (input1 + input2 + input3) / 3);
		
		
	}
	
}
