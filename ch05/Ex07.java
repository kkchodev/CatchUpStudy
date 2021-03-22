package javaJeongseok.ch05;

//자바의 정석 ch05
// 배열의 활용 - 섞기
public class Ex07 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; // 길이가 10인 배열 선언

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화 한다. 
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < 100; i++) { // 100인 이유? 없음. 그냥 
			int n = (int) (Math.random() * 10); // 0~9 중 임의의 수를 얻는다. 

			// numArr[0]과 numArr[n]의 값을 서로 바꾸기 - 100번 반복
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);

		/* 더 효율적인 방법
			 for(int i=0; i<numArr.length; i++) {
				 int n = (int)(Math.random()*10); // 0~9중 한 값을 임의로 얻는다. 
				 int tmp = numArr[i];
				 numArr[i] = numArr[n]; 
				 numArr[n] = tmp; 
				 }
		*/
		}
	}
}
