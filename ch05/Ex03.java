package javaJeongseok.ch05;

//자바의 정석 ch05
//배열의 복사(1)
public class Ex03{
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열 arr에 1~5를 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("[변경 전]");
		System.out.println("arr.length: "+arr.length);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		int[] tmp = new int[arr.length*2]; // 배열 arr의 길이보다 2배
		// 배열 arr에 저장된 값들을 배열 tmp에 복사
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp; // tmp에 저장된 값을 arr에 저장
		
		System.out.println("[변경 후]");
		System.out.println("arr.length: "+arr.length);
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		//근데 배열 길이만 늘어났지 값은 배열 1~5에만 있으니까..
	}
}
