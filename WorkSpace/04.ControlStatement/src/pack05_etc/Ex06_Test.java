package pack05_etc;

import java.util.Scanner;

public class Ex06_Test {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);<사용
		//국어 (kor ) , 영어(eng) , 수학(math) 점수를 입력을 받는다.
		//각 과목의 점수는 0부터 100점까지이며,
		//그 외에 점수가 입력되면 다시 입력하라는 메세지가 나오고 계속해서 입력받는다.
		//단,입력은 숫자만 한다.
		//kor,eng,math 세개의 int형 변수에 값이 모두 입력됐으면
		//과목의 평균점수와 합계 점수를 출력하는 프로그램.
		
		// 합계점수 = (kor + eng + math);
		// 평균점수 = (kor + eng + math)/3;
		// 평균점수 = 합계점수/3;
		//int kor = 0 ;
		//int eng = 0 ;
		//int math = 0 ;
		//while(true){
		//	if(조건식){
		//		kor = 사용자가 입력한값;
		//		break;
		//	}
		//}
		//1.사용자가 입력한(콘솔)값을 계속해서 입력받는다.(횟수에 제한이없음)
		// ( String -> int Parsing)
		//2.그값이 0~100사이의 값이 아니면 반복문은 계속 된다.
		//3.그값이 0~100사이의 값이면 반복문은 종료된다.
		//( 값의 비교는 String이 아니라 정수형 데이터를 표현할수있는 타입 int)

		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		while(true) {
			String inputData = sc.nextLine();
			kor = Integer.parseInt(inputData);
			//&& end연산자(모든 조건을 만족하면 true)
			//|| or연산자 (하나의 조건이라도 만족하면 true)
			if(kor >= 0 && kor <= 100) {
				System.out.println("0이상 100보다는 이하");
				System.out.println(kor);
				break;
			}
			//" 값 "
			//" 1 " == 더블코테이션을 제거(쌍따옴표) 문자열->숫자 
			//  ↓ Integer.parseInt("1")
			//  1  
			
		}
		
	}
}
