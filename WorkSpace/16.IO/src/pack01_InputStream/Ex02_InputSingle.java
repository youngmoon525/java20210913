package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputSingle {
	//사용자가 어떤 영문자 하나를 입력 ->enter key입력
	//enter 입력하는것은 프로그램의 종료 (terminate : Ctrl + C )가 아니다.
	//CR(Carriage Return) : 커서를 줄의 맨앞으로 이동시킴 == 13
	//LF(Line Feed) : 커서를 한 줄 아래로 이동 == 10
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("영문자 한글자를 입력해주세요.");
		int data = is.read();
		System.out.println(data);
		System.out.println((char)data);//int 97 - > 'a' character 
		data = is.read();
		System.out.println(data);
		System.out.println((char)data); //공백문자 ENTER : CR : 13
		data = is.read();
		System.out.println(data);
		System.out.println((char)data);//공백문자 ENTER : LF : 10
		
		
	}
}
