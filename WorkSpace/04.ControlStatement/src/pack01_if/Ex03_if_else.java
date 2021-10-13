package pack01_if;

import java.util.Scanner;

public class Ex03_if_else {
	public static void main(String[] args) {
		//if(조건식) {
			//참일때 실행되는 실행부
			//변수를 선언(초기화) - 사용범위는 if문 블럭 안에서만 사용가능하다
		
		//}else{
			//거짓일때 실행되는 실행부
		//}
		int score = 80;
		
		if(score >= 90) { // 80 >= 90 : false;
			System.out.println("A학점");
		}else {
			//조건식의 결과가 false 거짓일때의 실행부
			System.out.println("A학점이 아닙니다.");
		}//else 블럭
		
		int num = 4;
		if(num % 2 == 1) {
			int num2 = 10;//if문 블럭킹이 끝나는 순간에 메모리에서 사라짐
			System.out.println("num에 있는 값은 홀수입니다 " + num);
		}else {
			//num2 = 0; <-num2는 if문 블럭킹이 닫혔기때문에 사용할수가없다.
			System.out.println("num에 있는 값은 짝수입니다." + num);
		}
		//num2 = 0;<-num2는 if문 블럭킹이 닫혔기때문에 사용할수가없다.
	}
}
