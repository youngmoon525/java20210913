package package4;

public class Test1 {

//default <-같은 패키지 내에서만 접근이 가능
	int data1;
	public String data2;
	private int data3;
//public 또는 private으로 접근제한자를 줌.
//default를 사용하게 될 경우 개발자가 혼동할수가있다. 
//field를 또는 메소드를 전체적으로 공개할것인지 ,
//field 또는 메소드를 해당하는 클래스에서만 사용가능하게 할것인지
//두가지 경우를 대부분 사용함.
//	public int getData1() {
//		return data1;
//	}
//	public void setData1(int data1) {
//		this.data1 = data1;
//	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		if(data1 == -1) {
			
		}else {
			this.data1 = data1;
		}
	}
	public int getData3() {
		return data3;
	}
	public void setData3(int data3) {
		this.data3 = data3;
	}
	
}
