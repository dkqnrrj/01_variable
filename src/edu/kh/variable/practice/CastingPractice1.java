package edu.kh.variable.practice;

public class CastingPractice1 {

	
	public static void main(String[] args) {
		
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println( iNum1 / iNum2 ); // 2
		
		// '/' 나누기한 몫
		// '%' 나누기 하고 나머지 값
		
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		
		System.out.println( (double)iNum1 ); // 10.0
		
		
		System.out.println( (double)iNum1 / (double)iNum2 ); // 2.5
		
		
		System.out.println( dNum ); // 2.5
		
		
		System.out.println( (int)fNum ); // 3
		
		
		
		System.out.println( (int)(iNum1 / (int)fNum ) ); // 3

		
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림
		//double : 소수점 아래 16번째 자리까지 연산 후 반올림
	
		// 컴퓨터는 숫자를 2진수로 표현하는데 
		// 2진수 -> 10 진수로 변환 할때 소수점 이하를 정확히 표현 못해서 근사치로 출력된다.
		// (double 예제의 끝자리가 5인 이유)
		
		
		System.out.println( (float)iNum1 / fNum );// 3.3333333
		
		System.out.println( (double)iNum1 / (double)fNum ); // 3.3333333333333335
		System.out.println( "'" + ch + "'"  ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( "'" + (char) (ch + (char)iNum1)+ "'" ); // 'K'
		
		
	}
}
