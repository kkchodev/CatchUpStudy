package javaJeongseok.ch08;

public class Ex02 {
	public static void main(String[] args) {
		int number = 100; 
		int result = 0;
		
		for(int i=0; i<10; i++) {
			result = number / (int)(Math.random()*10); // 7번째 라인  
			System.out.println(result);
		}
	}
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at javaJeongseok.ch08.Ex02.main(Ex02.java:9)
// int 는 정수형인데, 0이 들어가면 안 되니까 에러 (math.random은 0~9사이 임의의 정수)