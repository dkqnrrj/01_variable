package edu.kh.variable.ex1;

public class VariableExample2 {

	
	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte (1byte), short (2byte) , int (4byte), long (8byte)
		 * 실수형 : float (4byte) , double (8byte)
		 * 문자형 : char (2byte, 유니코드가 들어가므로)
		 * 
		 * 
		 * 참조형 : String 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// 변수 선언 : 메모리에 값을 저장 할 공간을 할당 하는 것.
		// 변수값 대입 : 변수에 값을 집어넣는 것.
		
		// 카멜 표기법 : 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기하는 방식.
		
		boolean booleanData;
		
		//메모리에 논리 값(t/f)을 저장할 공간을 1byte 할당하고 이를 변수 booleanData에 저장함.
		
		
		booleanData = true;
		
		System.out.println("booleanData : " + booleanData);
		
		
		byte byteNumber = 127; // 128 넣으면 에러남(byte라서)
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고 할당된 공간을 byteNumber 라고 부르겠다.
		// 선언된 byteNumber 변수를 127로 초기화 하였다. -> 선언과 동시에 초기화
		
		System.out.println("byteNumber : " + byteNumber);
		
		short shortNumber = 32767; // 변수 선언과 동시에 초기화.
		
		int intNumber = 2147483647;
		
		// short , byte는 옛날 코드의 잔재
		// 자료형 변수명 = 리터럴;
		// 프로그래밍 에서는 대입되는 이 데이터(값 자체)를 리터럴 이라는 단어로 표현한다.
		
		//** 리터럴 : 변수에 대입 되거나 작성 되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // 대문자l 또는 소문자 l
		// The literal 	10000000000 of type int is out of range 라는 오류가 뜸.
		// -> 100억 이라는 값은 int의 범위를 벗어났다. (21억 까지만 가능)
		// 뒤에 L을 붙여줌으로써 long 자료형 임을 나타내는 것.
		
		float floatNumber = 1.2345f; // F 또는 소문자 f 도 가능.
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형
		// (리터럴 표기법이 없는 실수는 double로 인식)
		// d를 뒤에 써도 상관은 없음.
		
		// 문자형 리터럴 표기법 : ''
		// -> 무조건 문자 하나만 작성 해야함.
		
		char ch = 'A';
		char ch2 = 66;
		
		
		
		/* char 자료형에 숫자가 대입 될 수 있는 이유
		 *  - > 컴퓨터에는 문자표가 존재하는데
		 *  숫자에 따라 지정된 문자 모양이 매핑 되어있고
		 *  'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장
		 *  
		 *  -> 반대로 생각하면 변수에 66이라는 숫자를 저장하는 것도 가능하다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이 제한 x
		
		int abcdefg123456789;
		
		// 2. 예약어 사용 x
		//double double;
		
		// 3. 숫자 시작 x
		// char 1abc;
		
		//4. 특수문자는 $, _ 만 사용 가능 (하지만 쓰지 않는 것이 국룰)
		
		// _ 작성 표기법은 DB에서 사용함. (MEMBER_NAME)
		
		// 5. 카멜 표기법을 사용함.
		
		// 6. 변수명은 사실 언어를 가리지 않음. (한글로도 쓸수 있는건데 안 쓰는게 국룰.)
		
	
		
		
		final double PI_VALUE = 3.14;
		
		// PI_VALUE = 1; 에러남. 재대입 불가.
		
		/* 상수(항상 같은 수) : 
		 *  - 변수의 한 종류
		 *  - 한번 값이 대입 되면 다른 값을 재대입 할수 없다.
		 *  - 자료형 앞에 final 을 입력
		 *  
		 *  - 상수 명명 규칙 : 모두 대문자, 띄어쓰기 작성 시 _ 사용함.
		 * 
		 *  - 상수를 사용하는 경우
		 *  1) 변하면 안되는 고정된 값을 저장할 때
		 *  2) 특정 값에 의미를 부여할 때
		 *  
		 *  
		 *  
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		
		

		
	
		
		
		
		
		
		
				
		
	}
	
}
