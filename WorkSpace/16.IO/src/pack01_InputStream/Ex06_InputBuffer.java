package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex06_InputBuffer {
	public static void main(String[] args) throws IOException {
		//키보드에서 여러 글자를 입력받아서 출력 => 버퍼(Buffer)를 활용
		//필요성 - 일반적인 입출력은 여러 글자를 입력한다 하더라도
		//실제 처리를 한글자씩함(byte) 
		//입력한 글자수만큼 접근이 이루어진다 . ▶메모리 소모 + 속도 저하의 원인
		//이런 비효율성 개선을 위해서 여러글자를 입력하더라도
		//버퍼를 이용해서 한번에 입출력을 할수있도록 지원하다
		//버퍼의 크기 (기본) : 1024Byte = byte[] buffer = new byte[1024]
		//readLine()이라는 메소드를 사용한다.
		//인자값으로 입력받는 객체는 InputStreamReader
//		InputStream in = System.in;
//		InputStreamReader ir = new InputStreamReader(in);
		//InputStreamReader ir = new InputStreamReader(System.in);
		//Button btn = new Button();
		//int a = 10;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		System.out.println(msg);
		br.close();
		
		
		
		
		
		
		
		
	}
}
