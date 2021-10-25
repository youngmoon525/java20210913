package pack02_outputstream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04_OutputString {
	public static void main(String[] args) throws IOException {
		//OutputStream os = System.out;
		//InputStream -> InputStreamReader -> BuffredReader◎속도가 가장빠름
		// 
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		String str = "문자열을 입력\n 줄바꿈";
		osw.write(str);
		osw.flush();
	}
}
