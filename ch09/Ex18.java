package javaJeongseok.ch09;

// StringBuffer
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
				
		System.out.println("sb == sb2 ? " + (sb = sb2));
		System.out.println("sb.equals(sbs)? " + sb.equals(sb2));
		
		//StringBuffer의 내용을 String 으로 변환한다. 
		String s = sb.toString(); // String s = new String(sb); 와 같다 
		String s2= sb2.toString(); 
		
		System.out.println("s.equals(s2)? " + s.equals(s2));
	}

}
