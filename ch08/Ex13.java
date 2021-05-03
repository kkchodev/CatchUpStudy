package javaJeongseok.ch08;

public class Ex13 {
	public static void main(String[] args) {
		method1(); // 같은 클래스 내의 static 멤버이므로 객체생성 없이 직접 호출 가능 
	}
	//예외가 method1()에서 발생했으며 main 메서드가 method1()을 호출했음을 알 수 있다. 
	static void method1() {
		try {
			throw new Exception(); 
		}catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 표시되었습니다.");
			e.printStackTrace();
		}
	}
}
