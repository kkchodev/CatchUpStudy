package javaJeongseok.ch06;

//CallStackTest2
public class Ex08 {
	public static void main(String[] args) {
		System.out.println("main(String[] args) 시작");
		firstMethod();
		System.out.println("main(String[] args) 종료");
	}
	static void firstMethod() {
		System.out.println("firstMethod() 시작");
		secondMethod();
		System.out.println("firstMethod() 종료");
	}
	static void secondMethod() {
		System.out.println("secondMethod() 시작");
		System.out.println("secondMethod() 종료");
	}
}


// stack에서 각 메서드의 시작과 종료 순서를 알아보는 것. 