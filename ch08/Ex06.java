package javaJeongseok.ch08;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception e) { //ArithmeticException 대신 Esception 사용
			System.out.println(5);
		}
		System.out.println(6);
	}
}
