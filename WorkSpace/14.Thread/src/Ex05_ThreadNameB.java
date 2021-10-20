
public class Ex05_ThreadNameB extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "<-나의 이름");
		}
	}
}
