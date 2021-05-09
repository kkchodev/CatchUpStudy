package javaJeongseok.ch08;
// finally 블럭 
// 예외의 발생여부에 상관없이 실행되어야 할 코드를 포함시킬 목적으로 사용된다. 
// try-catch문의 끝에 선택적으로 덧붙여 사용할 수 있으며 try-catch-finally 순서로 구성된다.

public class Ex17 {
	public static void main(String args[]) {
	try {
		startInstall(); // 프로그램 설치 준비 
		copyFiles(); // 파일들 복사 
		deleteTempFiles(); // 프로그램설치에 사용된 임시파일들을 삭제한다. 
	} catch(Exception e) {
		e.printStackTrace();
		deleteTempFiles(); // 프로긂 설치에 사용된 임시파일들을 삭제한다. 
	}
}

static void startInstall() {
	/*프로그램 설치에 필요한 준비를 하는 코드를 적는다 */ 
	}
	static void copyFiles() { /*파일들을 복사하는 코드를 적는다 */
		
	}
	static void deleteTempFiles() { /*임시파일을 삭제하면 코드를 적는다 */  
		
	}
	}