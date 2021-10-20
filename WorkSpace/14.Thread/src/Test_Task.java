import java.awt.Toolkit;

//Runnable (<= interface )
public class Test_Task implements Runnable {
	int mill =0 ; //1000 , 500 
	String msg ; //동영상을 시청합니다. , 파일을 다운받습니다.
	
	public Test_Task(int mill, String msg) {
		super();
		this.mill = mill;
		this.msg = msg;
	}

	@Override
	public void run() {
		//실제 작업이 이루어 지는 부분
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(mill);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1000 1초. 
			System.out.println(msg);
		}
	}

}
