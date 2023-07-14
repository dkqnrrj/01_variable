package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
		/* 형변환 (Casting) : 값이 자료형을 변환 하는 것. ( 단, boolean은 제외)
		 * 
		 * - 형변환을 하는 이유
		 * 컴퓨터는 기본적으로 같은 자료형 끼리만 연산이 가능하기 때문.
		 * 
		 * - 자동 / 강제 형변환이 존재함.
		 * 
		 */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2));
		
		//원래 에러가 발생해야 하지만 자동 형변환이 이루어져 에러 없이 진행됨.
		
		int i1 = 3;
		double d1 = i1;
		
		
		System.out.println("i1 : " + + i1);  
		System.out.println("d1 : " + + d1);  
		
		//double은 실수만 저장 할 수 있는 자료형
		// 정수가 대입되는 연산이 수행되면 정수 -> 실수로 자동 형변환
		
		
		
		System.out.println(d1 + num2); 
		
		
		// int -> long 형변환
		
		int i2 = 2_100_000_000; //21억
		
		long l2 = 10_000_000_000l; // 100억
		
		long resurt2 = i2 + l2;
		
		System.out.println("resurt2 : " + resurt2);
		
		// char -> int 형변환
		
		/* char 자료형은 문자형 이지만 실제 저장하는 값은 숫자(유니코드)임.
		 */
		
		char ch3 = 'V';
		int i3 = ch3;
		
		System.out.println(ch3);
		System.out.println(i3);
		
		char ch4 = '가';
		int i4 = ch4;
		
		
		System.out.println(i4);
		
		
		// 오버플로우 현상은 컴퓨터가 예측 불가 하기 때문에 개발자가 미리 예측 해야함.
		
		int i6 = 2147483647;
		
		int result6 = i6 + 1;
		
		System.out.println(result6);
		
		
		
		
		
		
		
	}
}
