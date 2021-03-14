package javaJeongseok.ch04;

//FlowEx22. 향상된 for문
// for(타입변수명:배열or컬랙션){ 반복할 문장 }
public class Ex22 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		System.out.println("----------------");

		for (int a : arr) {
			System.out.printf("%d ", a);
			sum += a;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
}