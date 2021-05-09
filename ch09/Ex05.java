package javaJeongseok.ch09;

public class Ex05 {
	public static void main(String[] args) {
		String str = new String("KOREA"); 
		java.util.Date today = new java.util.Date(); 
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
		// String 클래스의 toString은 String 이면 문자열 반환하도록 오버라이딩 되어있고
		// DAte 클래스의 경우 Date 인스턴스가 갖고 있는 날짜와 시간을 문자열로 반환하도록..
	}
}
