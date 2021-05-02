package javaJeongseok.ch08;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {// try 블럭 내에서 예외가 발생하지 않는 경우
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
		System.out.println(5); // 실행되지 않는다. 
		} 
		System.out.println(6);
	} // catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속 한다. 
}
