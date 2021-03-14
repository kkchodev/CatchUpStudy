package javaJeongseok.ch04;

import java.util.Scanner;

// while문(3)
public class Ex25 {
	public static void main(String[] args) {
		int num= 0 , sum=0;
		System.out.print("숫자를 입력하세요.(예:12345)> ");
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 숫자를 tmp에 저장
		num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		System.out.println("입력한 숫자: " + num);
		while (num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10; //sum= sum += num % 10
			System.out.printf("sum = %3d, num = %d\n", sum, num);
			
			num /=10; // num = num / 10 ; num을 10으로 나눈 값을 다시 num에 저장 
		}
		System.out.println("각 자리 수의 합: " + sum);
		// num/=10에 의해 한자리씩 줄어들다가 0이 되면 while문의 조건식이 거짓이 되어 반복을 멈춘다. 
	}
}