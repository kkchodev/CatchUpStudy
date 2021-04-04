package javaJeongseok.ch07;

//Singleton

public class Ex14 {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // Error! Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();
	}
}

final class Singleton {
	private static Singleton s = new Singleton();

	public Singleton() {
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();

		return s;
	}

}

