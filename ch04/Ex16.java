package javaJeongseok.ch04;

// 중첩 for문(1)
public class Ex16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}