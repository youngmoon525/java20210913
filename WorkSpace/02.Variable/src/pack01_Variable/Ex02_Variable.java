package pack01_Variable;

public class Ex02_Variable {
	public static void main(String[] args) {
		//정수형 변수 a와 b를 선언하고 , a에 10 , b에 20을 할당
		//int a = 10;
		//int b = 20;
		//변수의 나열 데이터타입 변수1의 이름 , 변수2의 이름 ....
		int a = 10 , b = 20 ;
		//syso + ctrl + space
		System.out.println("변수 a의 값 : " + a);
		System.out.println("변수 b의 값 : " + b);
		//a의값을 30으로 , b의 값은 40으로 재할당 하시고 
		//다시 syso이용해서 출력을 해보세요.
		a = 30;
		b = 40;
		System.out.println("변수 a의 값 : " + a);
		System.out.println("변수 b의 값 : " + b);
		int c , d;
		c = a;
		d = b;
		System.out.println("변수 c의 값 : " + c);
		System.out.println("변수 d의 값 : " + d);
		//int c , d 를 선언하시고 
		//int c 에는 a를 복사 , d에는 b를 복사 한 후에 출력.
	}//main()
}//class()
