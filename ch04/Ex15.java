package javaJeongseok.ch04;

//for문 4
//for(초기화;조건식;증감식){}
public class Ex15 {
	public static void main(String[] args) {
		//변수 i값이 1부터 10까지 변하는 동안 다양한 연산자를 이용해서 
		// 짝수, 홀수, 제곱, 역순, 순환, 반복을 구하는 방법
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d\n", 
					i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
// %d : int 값을 부호 있는 10진수로 출력
// \t : 공백
// \n : 줄바꿈			
		
		}
	}
}
