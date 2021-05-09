package javaJeongseok.ch09;

import java.util.StringJoiner;
// join과 StringJoiner - split과 반대의 개념
public class Ex14 {	
	public static void main(String[] args) {
		String animals = "dog, car, bear"; 
		String [] arr = animals.split(","); 
		System.out.println(String.join("-",arr));
		
		StringJoiner sj = new StringJoiner("/","[","]"); 
		for(String s:arr)
			sj.add(s);
		System.out.println(sj.toString());
	}

}
