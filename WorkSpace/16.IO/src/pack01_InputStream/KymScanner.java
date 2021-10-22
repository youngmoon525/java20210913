package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KymScanner {
BufferedReader br;
	public KymScanner(InputStream in) {
		//InputStreamReader irs = ;
		this.br = new BufferedReader(new InputStreamReader( in ));
	}
	
	//void , void x
	//리턴이없음 , 리턴이 있음
	//어떤것이든 리턴타입이 될수있다.
	public String nextLine(int a) {
		String msg = null;
		try {
			msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
//	private BufferedReader br; // null => new 
//	//Thread d = new Thread()
//	//InputStream in = System.in;
//	public KymScanner(InputStream in) {
//		this.br = new BufferedReader(new InputStreamReader(in));
//	}
//	//void이냐 void가 아니냐.
//	public String nextLine() {
//		try {
//			return br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//			return "";
//		}
//	}
	
}
