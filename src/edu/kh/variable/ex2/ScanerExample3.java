package edu.kh.variable.ex2;



import java.util.Scanner;




public class ScanerExample3 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//문자열(String) 입력
		//문자열을 3번 입력 받아 한줄로 출력하기
		
		//ex)
		//입력 1 : 안녕?
		//입력 2 : 반가워!
		//입력 3 : 점심뭐먹을래?
		//안녕? 반가워! 점심뭐먹을래?
		
		
		System.out.print("입력 1 : ");
		String input1 = sc.next();
		
		System.out.print("입력 2 : ");
		String input2 = sc.next();
		
		System.out.print("입력 3 : ");
		String input3 = sc.next();
		
		
		
		System.out.printf("%s %s %s\n", input1, input2, input3);
		
		
		// 숫자도 입력 가능 (문자열로 인식)
		
		
	}
	
	
}
