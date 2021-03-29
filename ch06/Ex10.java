package javaJeongseok.ch06;

//Ex09 ~ Ex10 
public class Ex10 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = " + d.x);

		change(d); // 이전 예제와 달리 change 메서드를 호출한 후에 d.x의 값이 변경됨 
		// change 메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사됨 
		// 이제 매개변수 d에 저장된 주소값으로 x에 접근이 가능 
		// change 메서드가 종료되면서 매개변수 d는 스택에서 제거 
		System.out.println("After change(d)");
		System.out.println("main(): x = " + d.x);
	}

	static void change(Data d) { // 참조형 매개변수
		d.x = 1000; // change 메서드에서 매개변수 d로 x값을 1000으로 변경 
		System.out.println("change(): x = " + d.x);
	}  
}