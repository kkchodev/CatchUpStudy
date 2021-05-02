package javaJeongseok.ch08;

public class Ex01 {
 public static void main(String[] args) {
	try {
		try { } catch(Exception e) { }
	
	}catch(Exception e) {
		try { } catch(Exception e2) { } // 에러. 변수 e 가 중복 선언됨 
	}// try-catch의 끝 
	try {
	}catch(Exception e) {
		//try-catch 끝 
	}
}// main 메서드의 끝 
}

// 하나의 메서드 내에 여러 개의 try-catch문이 사용될 수 있으며 
// try 블럭 또는 catch 블럭에 또 다른 try-catch문이 포함될 수 있다. 
// catch 블럭 내에 또 하나의 try-catch 문이 포함된 경우 같은 이름의 참조 변수를 사용해선 안 된다. 