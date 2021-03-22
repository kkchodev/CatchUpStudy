package javaJeongseok.ch05;

import java.util.Arrays;

//자바의 정석 ch05
// 임의의 값으로 배열 채우기
public class Ex09 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 }; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length); 	//code.length-1 까지 = 4
			// tmp에 0,1,2,3,4 (배열 순서) 중 하나가 저장된다. 
			arr[i] = code[tmp];
		}

		System.out.println(Arrays.toString(arr));
	}
}