package javaJeongseok.ch06;

//TvTest4
//Ex01~Ex04
public class Ex04 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		// 배열의 초기화 블록을 사용하면 다음과 같이 한 줄로 간단히 할 수 있다. 
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]의 메서드 호출. 채널이 1 증가
			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);
		}
	}
}