package pack03_FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03_FileWriter {
	public static void main(String[] args) throws IOException {
		//자바소스 -> 경로에 실제 있는 파일로 쓰기 
		String str = "";
		Writer writer = new FileWriter("D:\\Study_Java\\IO_FORDER\\Ex03_File.txt");
		//Ex03_FileGugu
		//for문을 이용해서 구구단을 텍스트파일에 저장해보세요.
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
			for (int j = 1; j < 10; j++) {
				//System.out.print(i + " * " + j + " = " + (i*j) + "\t");
				str = i + " * " + j + " = " + (i*j) + "\t";
				System.out.print(str);
				writer.write(str);
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
		//==========================
//		
//		String str = "ABC";
//		
//		writer.write(str+"\n");
//		writer.write(str);
//		writer.write(str);
//		writer.write(str);
//		//버퍼에 담아진 모든내용을 텍스트파일에 강제로 쓴다.
//		
		//============================
	}
}
