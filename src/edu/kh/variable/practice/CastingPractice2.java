package edu.kh.variable.practice;


import java.util.Scanner;

import java.lang.Integer;



public class CastingPractice2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자 : ");
		
		char input1 = sc.next().charAt(0);
		
		//charAt(0) : 문자열 중에 첫번째 문자만(0) 입력 받도록 설정, 문자열이 char가 됨.
		
		System.out.println();
		
		
	
	
		
	System.out.print(input1 + " unicode : " + (int)input1);
		
		
	}
	
	
	
}
