package pack06_changeType1;

public class PromotionMain {
	public static void main(String[] args) {
		A a = new A();//부모클래스 
		B b = new B();//A의 자식클래스
		C c = new C();//A의 자식클래스
		D d = new D();//B의 자식클래스
		E e = new E();//C의 자식클래스
		//데이터를 표현할수있는 크기가 더 작은것->큰것
		//                        큰것 ->작은것
		// (int) double
		e = (E) c; //큰것->작은것
	}
}
