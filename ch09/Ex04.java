package javaJeongseok.ch09;

// toString() 
// 인스턴스에 대한 정보를 문자열로 제공 
class Card {
	String kind; 
	int number;
	
	Card() {
		this("spade",1); 
	}
	Card(String kind, int number){
		this.kind = kind; 
		this.number = number;
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
