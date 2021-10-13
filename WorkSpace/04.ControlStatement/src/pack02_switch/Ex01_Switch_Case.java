package pack02_switch;

public class Ex01_Switch_Case {
	public static void main(String[] args) {
		// 제어문 - 조건문 , 선택문
		// 선택문 switch : == 다중 if문을 간략하게 표현
		// 조건을 주기가 까다롭기때문에 사용빈도가 낮다

		// switch ( 조건식x , 값 , ){
		// case 값1:
		// break;
		// case 값2:
		// break;
		// }

		int score = 5;
		// 값
		// if문의 경우에는 조건식을 사용하기때문에 값에 범위를 줄수있다.
		// switch문의 경우에는 값만을 이용하기때문에 범위를 주기가 까다롭다/.
		// 줄정리 단축키 = ctrl + shift + f
		switch (score / 10) {
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		default :
			System.out.println("if문의 else!");
			break;
		}// switch지역

	}
}
