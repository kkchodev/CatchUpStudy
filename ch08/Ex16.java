package javaJeongseok.ch08;

import java.io.File;

public class Ex16 {
	public static void main(String[] args) {
		try {
			File f= createFile(args[0]); 
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage()+"다시 입력해 주시기 바랍니다.");
		}
	} // main메서드 끝 


static File createFile(String fileName) throws Exception{
	if (fileName==null || fileName.equals(""))
		throw new Exception("파일이름이 유효하지 않습니다.");
	File f = new File(fileName);  // File 클래스의 객체를 만든다. 
	// File 객체의 createNewFIle 메서드를 이용해서 실제 파일을 생성한다.
	f.createNewFile(); 
	return f ; //생성된 객체의 참조를 반환한다. 
	}
}
// Ex15와의 차이점은 예외의 처리방법에 있다. 예제 15는 예외가 발생한 createFile 메서드 자체 내에서
// 처리를 하며, Ex16은 createFIle메서드를 호출한 메서드(main메서드)에서 처리한다. 