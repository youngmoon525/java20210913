import java.awt.Toolkit;

public class Ex02_BeepTaskMain {
	public static void main(String[] args) throws InterruptedException {
		//Thread가 작업을 할수있는 Runnable을 상속받은
		//객체(class)를 Thread작업으로 넣어줄수있다.
		Runnable beep_task = new Ex02_BeepTask();
		Thread thread = new Thread(beep_task);
		thread.start();
		System.out.println("테스크가 동작중");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(200);//1000 1초. 
			System.out.println("OOOOO");
		}
		
		
	}
}
