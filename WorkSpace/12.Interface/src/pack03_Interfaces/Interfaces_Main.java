package pack03_Interfaces;

import pack01_Interface.TestInterface;
import pack02_Interface.RemoteController;

//extends (다중상속을 지원안함)
//implements (다중상속을 지원함)
public class Interfaces_Main implements TestInterface , RemoteController {
	
	@Override
	public void test1() {
		System.out.println("test1입니다.");
	}

	@Override
	public void test2() {
	
	}

	@Override
	public void test3() {
	
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 키는 메소드");
	}

	@Override
	public void turnOff() {
	
	}

	@Override
	public void setVolume(int volume) {

	}
	int volume;
	static Interfaces_Main ims = new Interfaces_Main();
	public static void main(String[] args) {
		//turnOn , test1 
		Interfaces_Main im = new Interfaces_Main();
		im.test1();
		im.turnOn();
		//↑
		ims.test1();
		ims.turnOn();
	}
}
