package pack02_outputstream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex05_OutputBuffer {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//?
		bw.write("스트링 데이터를 \n 넣을 수 있습니다.");
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
