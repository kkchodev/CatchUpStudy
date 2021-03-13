package javaJeongseok.ch04;

import java.util.Scanner;

// switch문 2 - 가위바위보
public class Ex07 {
	public static void main(String[] args) {
		System.out.println("가위(1),바위(2),보(3) 중 하나를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt(); // 화면에 입력받은 숫자를 user에 저장 
		int com = (int)(Math.random()*3+1); // 1~3 중 하나가 com에 저장됨
		
		System.out.println("당신은 " + user+ "을(를) 선택");
		System.out.println("컴퓨터는 " + com + "을(를) 선택");
		
		switch(user) {
		case 1:
			System.out.println("당신은 가위를 냈습니다.");
			break;
		case 2: 
			System.out.println("당신은 바위를 냈습니다. ");
			break;
		case 3: 
			System.out.println("당신은 보를 냈습니다. ");
			break;
		default:
			System.out.println("1,2,3 중 다시 입력해주세요.");			
		}
		
		switch(user-com) {
		case 2: 
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다. ");
			break;
		case 0: 
			System.out.println("비겼습니다.");
			break;			 // 마지막 문장이므로 break를 사용할 필요가 없다.

		}
	}
}
