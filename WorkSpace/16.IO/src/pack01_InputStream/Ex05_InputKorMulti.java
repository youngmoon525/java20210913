package pack01_InputStream;

import java.io.InputStreamReader;

public class Ex05_InputKorMulti {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("한글 여러글자를 입력해주세요.");
		try {
			int data ;
			while ( (data = isr.read()) != -1 ) {
				if(data != 13 && data != 10) {
					System.out.println("입력하신 글자 " + (char)data );
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//InputStreamReader isr 이라는 이름으로 초기화 시키기.
		//int data;
		//while ( (data=isr.read() == -1 ){
		//	if( data != 13 && data != 10 ) {
		//	syso( char(data) )
		// }
		//}
	}
}
