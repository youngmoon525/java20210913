package pack02_Interface;

//Interface를 이용해서 개발.
public class Test implements RemoteController{
	private int volume;//<-외부에서는 바로 필드에 접근이 불가능
	@Override
	public void turnOn() {
		System.out.println("Test를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Test를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOL) {
			this.volume = MAX_VOL;//10
		}else if(volume < MIN_VOL) {
			this.volume = MIN_VOL;//-1 -2 - 
		}else {
			this.volume = volume;
		}
		System.out.println("Test현재 볼륨 : " + this.volume);
		setTest();
	}

	public int getVolume() {
		return volume;
	}
	public void setTest() {
		System.out.println("테스트 중입니다.");
	}
	

}
