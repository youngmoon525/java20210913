package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex03_InputMulti {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("영문자 여러글자를 입력해주세요.");
		int data ;
		while( (data = is.read()) != -1) {
			System.out.println("입력하신 영문자는 " + (char)data + "입니다.");
		}
		System.out.println("종료되었습니다.");
	}
}
