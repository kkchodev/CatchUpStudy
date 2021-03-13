package javaJeongseok.ch04;

import java.util.Scanner;

// switch문의 중첩
public class Ex11 {

	public static void main(String[] args) {

		System.out.println("당신의 주민번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine(); // 주민번호를 입력받음
		
		char gender = regNo.charAt(7); // 입력받은 regNo의 8번째 문자 gender에 저장 
		// charAt(index) : 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴한다.
		
		switch(gender) {
			case '1': case '3': // gender 타입이 char 이니까 '' 입력 
				// 만약 8번째 문자가 1이나 3이면
				switch(gender) {
					case '1': System.out.println("당신은 2000년 이전 출생 남성입니다.");
						break;
					case '3': System.out.println("당신은 2000년 이후 출생 남성입니다.");
				}
				break; //break 문을 빼먹지 않도록 주의할 것 

			case '2':case '4':				
				switch(gender) {
					case '2': System.out.println("당신은 2000년 이전 출생 여성입니다.");
						break;
					case '4': System.out.println("당신은 2000년 이후 출생 여성입니다.");
						break;			
				}
				break; //break 문을 빼먹지 않도록 주의할 것 			
		default: 
			System.out.println("유효하지 않은 주민등록 번호입니다.");
		}

	}
}
