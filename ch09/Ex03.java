package javaJeongseok.ch09;
// hashCode() : 객체를 식별하는 하나의 정수값
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode : 문자열 내용이 같으면 동일한 해시코드 반환하도록 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//identityHashCode : Object 클래스의 hashCode 메서드처럼 객체의 주소값으로 
		// 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드를 반환 
		// 즉, str1 2는 해시코드는 같지만 서로 다른 객체! 
	}

}
