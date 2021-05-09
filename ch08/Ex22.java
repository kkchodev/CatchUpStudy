package javaJeongseok.ch08;

public class Ex22 {
	public static void main(String[] args) {
	
	try {
		method1();
	}catch(Exception e) {
		System.out.println("main 메서드 예외 처리가 되었습니다.");
	}
}

static void method1() throws Exception {
	try {
		throw new Exception(); 
	}catch (Exception e) {
		System.out.println("main1 메서드에서 예외 처리가 되었습니다.");
		throw e; // 다시 예외를 발생시킨다. 
	}
}
}

// 한 메서드에서 발생할 수 있는 예외가 여럿인 경우 몇 개는 try-catch문을 통해서 메서드 
// 내에서 자체적으로 처리하고, 그 나머지는 선언부에 지정하여 호출한 메서드에서 처리하도록 함으로써 
// 양쪽에서 나눠서 처리되도록 할 수 있다. 