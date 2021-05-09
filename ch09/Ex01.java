package javaJeongseok.ch09;

// equals
	
public class Ex01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10); 
		
		if (v1.equals(v2))
			System.out.println("v1와 v2는 같습니다.");
		else
			System.out.println("v1와 v2는 다릅니다."); 
		// 주소값이 다르므로 v1과 v2는 다름
		
		v2 = v1;  //참조변수 v2에는 v1이 참조하고 있는 인스턴스의 주소값이 저장된다.
		if (v1.equals(v2))
			System.out.println("v1와 v2는 같습니다.");
		else
			System.out.println("v1와 v2는 다릅니다.");	
	}
}


class Value {
	int value ; 
	Value(int value){
		this.value=value;
	}
}