package javaJeongseok.ch09;

class Card1{
	String kind;
	int number;
	
	Card1() {
		this("spade",1); 
	}
	Card1(String kind, int number){
		this.kind = kind; 
		this.number = number;
	}
	public String toString() {
    	return "kind: "+ kind + ", number : " + number;
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Card1 c1= new Card1();
		Card1 c2= new Card1("heart", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}
