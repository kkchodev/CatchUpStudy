package javaJeongseok.ch08;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다. 
		}catch(ArithmeticException ae) {
			if( ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}
	// try-catch 문의 마지막에 Exception 클래스 타입의 참조변수를 선언한 catch 블럭을 
	// 사용하면 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해 처리되도록 할 수 있다. 
}
