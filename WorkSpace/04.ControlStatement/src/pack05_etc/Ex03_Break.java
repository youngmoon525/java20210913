package pack05_etc;

import java.util.Scanner;

public class Ex03_Break {
	public static void main(String[] args) {

		//1.Scanner를 사용해서 콘솔에 입력된값을 계속해서 가져온다. - O 
		//2.단 입력은 테스트 시 숫자만 입력한다. - O
		//3.String -> int로 바꿔서 -0
		//4.사용자가 입력한값을 계속해서 누적해서 더한다. - O
		//5.사용자가 -1을 입력했을때는 프로그램을 종료하고 누적시킨값을 보여준다.
		Scanner sc = new Scanner(System.in);
		//스캐너를 초기화시킴 (사용준비만함)
		int sum = 0;//누적시킬 변수를 무한루프 밖에 선언.(초기화)
		while(true) {
			String data = sc.nextLine();//<콘솔창에 입력한값을 가져옴
			//"30" <-문자열 ====> int형 30
			int number = Integer.parseInt(data);
			if(number == -1) {
				System.out.println(sum);
				break;
			}
			sum = sum + number;
			
		}
		
		
		
		
	}
}
