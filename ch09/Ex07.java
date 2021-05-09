package javaJeongseok.ch09;

// clone() : 자신을 복제하여 새로운 인스턴스를 생성 => 얕은 복사 
class Point implements Cloneable{
	int x, y; 
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x=" + x + ", y" + y;
	}

public Object clone() {
	Object obj = null; 
	try {
		obj = super.clone(); // clone()은 반드시 예외처리를 해줘야 한다. 
	} catch (CloneNotSupportedException e) {}
	return obj; 
	}
}

public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3,5); 
		Point copy = (Point)original.clone(); // 복제(clone) 해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}

}
