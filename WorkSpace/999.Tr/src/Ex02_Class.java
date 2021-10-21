
public class Ex02_Class {// Ex02_Class 장난감의 설계도 => 장난감
	// 인스턴스 멤버
	// 속성을 가질수있는 변수 ( 필드 , 인스턴스 변수 , iv )
	String name;
	final String color = "검정";
	int price;

	// 스태틱
	public static void main(String[] args) {

		Ex02_Class j1 = new Ex02_Class();// 장난감1번이 만들어짐.
		// j1.color = "";
		System.out.println(j1.color);
		Ex02_Class j2 = new Ex02_Class();// 장난감2번이 만들어짐.
		j2.jMethod1();
		// j2.color = "빨강";
		// 인스턴스화 ( 설계도를 이용해서class 우리가 쓸수있는 제품형태로 만드는 행위)
		int arm = 10;
		j2.jMethod2(10);
		j2.jMethod3(arm, 20, 30, "data");

	}

	// 장난감의 기능 (Method) void , void가 아니냐
	// void == 리턴타입이 없는 ( 메소드가 실행되고 나서 어떤 결과를 안받아도 될때)
	// void != 리턴타입이 무조건 있는 ( 메소드가 실행되고 나서의 결과가 중요할때 사용)
	void jMethod1() {// 메소드는 클래스의 내부에 있어야한다.
		System.out.println("jMethod1");
	}

	void jMethod2(int arm) { // 파라메터(인자) 값으로 입력을 받아온다.
		// 변수를 선언만 한다. ex) int a , String b , double c ,BookDTO dto
		// 선언된 변수는 메소드를 호출할때 넘겨주는 값이 담기는 그릇이 된다.
		System.out.println(arm);
		// 왼쪽팔 또는 오른쪽 팔 또는 양쪽팔 을 움직여야 하는 상황,신호를 받아야 할때.
		System.out.println("장난감의 팔을 움직입니다.");
	}

	void jMethod3(int arm, int foot, int head, String data) {
		System.out.println("호출됨");
	}
	// jMethod3();
	// jMethod4을 만든다.장난감의 기능4번
	// String 데이터 3개와 int형 데이터 1를 입력받으면
	// 입력받은 내용을 전부 콘솔창에 출력하는 기능을 가졌다.

}
