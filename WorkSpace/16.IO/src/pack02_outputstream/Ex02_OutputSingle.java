package pack02_outputstream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex02_OutputSingle {
	public static void main(String[] args) {
		OutputStream os = System.out;
		try {
			os.write(65); // OutputStream Buffer라는 데이터 저장 개념에
						  //데이터를 쌓아 두기만 한상태.
			os.flush();   //<-System.out.prlintln("데이터의 flush")	
						  //<-System.out.print('write')
		} catch (IOException e) {
			e.printStackTrace();
		}//?
	}
}
