package javaJeongseok.ch08;

public class Ex03 {
	public static void main(String[] args) {
		int number = 100; 
		int result = 0; 
		
		for(int i=0; i<10; i++) {
			try {
				result=number/(int)(Math.random() * 10); 
				System.out.println();
			}catch(ArithmeticException e) {
				System.out.println("0");
			} 
		}
	}
}
// 만약 예외처리를 하지 않았다면 0 나오자마자 예외가 발생해서 프로그램이 비정상적으로 종료되었을 것. 