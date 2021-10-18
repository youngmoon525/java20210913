package package3;

public class E {
	//public D(int num) {	} <-인스턴스화 가능할까 안할까?
	//D(String data) { }<-인스턴스화 가능할까 안할까?
	//private D() {}<-인스턴스화 가능할까 안할까?
	D d1 = new D(1);//사용이 가능하다.
	D d2 = new D("2");//사용이 가능하다.
	D d3 = new D();//private 접근제한자 때문에 접근이 불가능함
	
}
