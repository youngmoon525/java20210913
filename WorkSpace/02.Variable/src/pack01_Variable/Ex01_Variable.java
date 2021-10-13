package pack01_Variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		//var <- DataType ?
		//var a = '값을' ;
		//int a , String b 같은 형태를 변수라고 한다.
		//변수를 선언하는 방법은 변수의 타입을 지정해주고 그다음 변수의
		//이름이 나오면 된다.
		//보라색으로 글씨가 바뀌는 경우 java에서의 예약어.
		//예약어 : 자바 프로그램을 구성하기 위해서 java자체에서 미리 
		//사용해놓은 이름들을 말한다.
		//int = 데이터타입이 정수인 데이터를 저장하기 위한 변수타입이다.(예약어)
		//첫글자를 소문자로 시작한다(변수)
		int kym ;//변수의 선언
		//할당을 할때는 이미 선언해둔 변수에 =(equl)을 이용하여 할당
		kym = 10;//변수 kym에 값 10을 할당
		System.out.println(kym);
		//변수의 초기화 ( 변수를 선언과 동시에 값을 할당하는 것,리터럴,Literal)
		//변수 타입 변수명 = 값 ; ◀ 초기화 식
		int a = 100;
		System.out.println(a);
		a = 50;//값을 재할당
		System.out.println(a);
		
		int x = 10; //x라는 이름으로 int형 변수를 초기화 시킴.
		int y = x;
		int z = y;
		x = z;
		System.out.println(y);
	}//main
}//class
