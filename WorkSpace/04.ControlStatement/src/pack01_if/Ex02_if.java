package pack01_if;

import java.util.Scanner;

public class Ex02_if {
	public static void main(String[] args) {
		// 흐름을 제어하는 제어문 중에는 크게 조건문,반복문
		// 조건문 if
		//단순 if문 : 조건을 판단하여 참일 경우에만 실행
		//if(조건식) {
		//	if문의 지역,if문의body 조건식이 참일때 실행되는 부분
		//}
		Scanner sc = new Scanner(System.in);//스캐너의 사용을 준비함(스캐너 초기화식)
		String inputData = sc.nextLine();
		
		//문제. inputData에는 sc.nextLine()통해서 String 숫자데이터가 들어있다.
		//해당하는 숫자가 홀수인지 짝수인지를 if문으로 판단하여 콘솔창에 출력하시오.
		//나머지를 구하는 방법   % 2 == 1인지 % 2 == 0인지
		
		
		
		
		int num = Integer.parseInt(inputData);
		if(num % 2 > 0) {
			System.out.println("입력하신 숫자는 홀수 입니다.");
		}
		if(num % 2 < 1) {
			System.out.println("입력하신 숫자는 짝수 입니다.");
		}
	}
}
