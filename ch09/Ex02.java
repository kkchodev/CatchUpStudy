package javaJeongseok.ch09;

// value 값으르 비교하도록 할 수는 없을까?
// -> 오버라이딩 개념 
class Person{
	long id; 
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id; 
			// obj가 Object 타입이므로 id값을 참조하기 위해서는 Person 타입으로 형변환
		else 
			return false; //타입이 Person이 아니면 값을 비교할 필요도 없다. 
	}
	Person(long id){
		this.id = id; 
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person(8101000212L);
		Person p2 = new Person(8101000212L);
		if(p1==p2)
			System.out.println("p1와 p2는 같은 사람입니다");
		else
			System.out.println("p1와 p2는 다른 사람입니다.");
		if(p1.equals(p2))
			// equals 메서드가 Person 인스턴스의 주소값이 아닌 멤버변수 id값을 비교하도록 
			// 하기 위해 equals 메서드를 오버라이딩 했다.. 그렇기 때문에 
			// 같은 내용의 문자열을 갖는 두 String 인스턴스에 equals 메서드를 사용하면 항상
			// true 값을 같는 것.  (주소값이 아닌 내용을 비교하도록 오버라이딩 되어있음) 
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}
