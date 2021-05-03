package javaJeongseok.ch08;

public class Ex14 {
	public static void main(String[] args) {
		try {
			method1();
		}catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception{
		throw new Exception(); 
	}
}

// 이 예제도 main 메서드가 method1()을 호출하며 method1()에서 예외가 발생했다. 
// method1()에서 예외를 선언하여 자신을 호출하는 메서드(main메서드)에 예외를 전달했으며 
// 호출한 메서드(main 메서드)에서는 try-catch문으로 예외처리를 했다.  
