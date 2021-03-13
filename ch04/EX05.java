package javaJeongseok.ch04;


	import java.util.*;

	// 자바의 정석 / 중첩 if문
	public class Ex05 {
		public static void main(String[] args) {
			int score=0;
			char grade = ' ', opt='0';
			
			System.out.print("점수를 입력해주세요.> ");
			Scanner sc = new Scanner(System.in);
			score = sc.nextInt();
			
			if(score>=90) { // 90점 이상인 경우
				grade='A'; // 성적은 A 
				if(score>=98) { // 그 중에서 98이상이면 
					opt = '+';  // +가 붙고 
 				} else if(score<=94) { // 94이하이면 
					opt = '-'; // -가 붙음
				} 
			} else if(score>=80) {//80점 이상인 경우 
				grade='B';
				if(score>=88) {
					opt = '+';
				} else if(score<=84) {
					opt = '-';
				}
			} else { // 그 외에는 C 
				grade = 'C';
			}
			
			
			System.out.println("당신의 학점은 "+grade+opt+"입니다.");
		}
	}
