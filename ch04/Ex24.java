package javaJeongseok.ch04;

// while문(2)
public class Ex24 {
	public static void main(String[] args) {
		int i = 11;

		System.out.println("카운트 다운을 시작합니다.");

		while (i-- != 0) {
			System.out.println(i); 
			// 10부터 0까지 1씩 감소시키면서 출력을 하되, 매 출력마다 약간의 시간이 지연되도록 함

			for (long j = 0; j < 3_000_000_000L; j++) { //{} 사이에는 아무 일도 하지 않는 빈 문장 ,, 
				// 조건식과 증감식을 30000000000번 반복하며 시간을 보낼 뿐
				;
				// for(int j=0; j<2_000_000_000; j++); 
				// for(int j=0; j<2_000_000_000; j++){} 과 같은 문장
			// 컴퓨터 성능에 따라 지연되는 시간이 다르므로 적절히 조절하기 
			}
		}
		System.out.println("GAME OVER");
	}
}