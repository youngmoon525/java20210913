package pack02_outputstream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex03_OutputMulti {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		//char 
		char a = 'a';
		char b = 'b';
		char c = 'c'; //
		
		os.write(a);
		os.write(b);
		os.write(c); //버퍼에 a , b , c라는 문자가 쌓임.
		
		os.flush();
		//os.close();//사용을 다한 OutputStream은 반드시 닫아둔다.
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.println();
		
	}
}
