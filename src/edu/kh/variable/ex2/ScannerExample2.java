package edu.kh.variable.ex2;

import java.util.Scanner;


public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//사칙연산 계산기 만들기
		//-> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 둘쨰자리 까지만
		
		
		//정수 : sc.naextInt();
		//실수 : sc.nextDouble();
		
		System.out.print("실수 1 입력 : ");
		Double input1 = sc.nextDouble();
		
		
		//nextDouble() : 입력 받은 실수를 읽어온다. 
		
		
		System.out.print("실수 2 입력 : ");
		Double input2 = sc.nextDouble();
		
		
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
		
	}
}
