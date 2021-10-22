package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_SystemIn {
	public static void main(String[] args) {
		//IO<-프로그램의 외부에서의 작업이기 때문에 예외처리가 중요한 부분으로 존재한다.
		//I=NEW
		//S=X
		try {
			int aa = System.in.read();//BlockState(입력이 있을때까지 대기)
			System.out.println(aa);
			InputStream is = System.in;//노드 스트림 : 가장 먼저 연결되는 스트림
									   //외부에서 들어오는 데이터를 받을수있는스트림
			int bb = is.read();
			System.out.println(bb);
			int cc = is.read();
			System.out.println(bb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
