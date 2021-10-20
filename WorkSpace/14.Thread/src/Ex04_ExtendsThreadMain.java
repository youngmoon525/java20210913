import java.awt.Toolkit;

public class Ex04_ExtendsThreadMain {
	public static void main(String[] args) {
		//Ex04_ExtendsThread Thread라는 부모클래스(상속)
		Thread thread = new Ex04_ExtendsThread();
		thread.start();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 1초. 
			System.out.println("동작함");
		}
		
	}
}
