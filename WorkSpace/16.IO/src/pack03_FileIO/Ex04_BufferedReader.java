package pack03_FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04_BufferedReader {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Study_Java\\IO_FORDER\\aaaa.txt");
		if (f.exists()) {
		Reader reader = new FileReader(f);
		BufferedReader br = new BufferedReader(reader);
		while(true) {
			String data = br.readLine();//데이터를 한줄씩 읽어옴.
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		reader.close();
	}else {
		System.out.println("경로 없음");
	}
	}
}
