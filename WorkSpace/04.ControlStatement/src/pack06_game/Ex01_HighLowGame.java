package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Random random = new Random();
		int comNumber = random.nextInt(100)+1;//(값) 그값까지만 랜덤한수를뽑음
		int userNumber = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			count ++ ;
			System.out.println("1부터 100사이의 정수를 입력해주세요.");
			userNumber = Integer.parseInt(sc.nextLine());
			if(userNumber > comNumber) {
				System.out.println("더 작은 수를 입력해주세요.");
				continue;
			}else if(userNumber < comNumber) {
				System.out.println("더 큰 수를 입력해주세요.");
				continue;
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도한 횟수는" + count + "번 입니다.");
				break;
			}
		}
		//1.comNumber라는 변수에는 1~100까지의 랜덤한 수가 저장이된다.
		//2.HighLow게임을 구현
		//무한반복. 사용자가 입력(콘솔창에 입력)한 수가 comNumber와 같을때까지.
		//사용자가 입력한수가 컴퓨터 랜덤숫자보다 큰지 작은지를 콘솔창에 출력해준다.
		//3.count라는 변수는 사용자가 답을 몇번 입력했는지 체크한다.
		//4.comNumber == userNumber가 같으면 게임을 종료하고
		//count가 몇인지 출력을 한다.
		
		
	}
}
