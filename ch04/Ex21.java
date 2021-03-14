package javaJeongseok.ch04;


// 중첩 for문(6)
public class Ex21 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
	}
}
// 이중for문에 if문을 넣어서 조건식 i==j를 만족하는 경우에만 i,j 출력하도록