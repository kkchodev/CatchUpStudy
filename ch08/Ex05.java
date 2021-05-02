package javaJeongseok.ch08;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다. 에러 발생하면 바로 catch 문으로 가니까
		}catch(ArithmeticException ae) {
			System.out.println(5);
		}

	}
}
