package pack02_VariableType;

public class Ex01_VariableTP {
	public static void main(String[] args) {
		//설명을 달때 사용 ,
		//String <- 첫글자가 대문자로 시작되고 문자'열'을 저장할때 사용한다.
		//int <- 숫자(정수)형 데이터를 저장할때 사용한다.
		//double <- 소숫점(실수)형 데이터를 저장할때 사용한다.
		//boolean <- 부울(참,거짓,논리)형 데이터를 저장할때 사용한다.(true,false)
		//변수타입 변수명 = "초기값"; <- 변수의 초기화
		String str = "문자열";//문자열은 더블코테이션(쌍따옴표로 그값을 싸준다)
		System.out.println(str);
		int int1 = 3; //문자열 데이터를 제외한 변수에는 코테이션 사용x
		System.out.println(int1);
		double double1 = 3.14;
		System.out.println(double1);
		boolean bool = true; //true=1, false=0;
		System.out.println(bool);
	}
}
