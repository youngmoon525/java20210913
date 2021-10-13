package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex02_DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//스캐너의 사용 준비.
		Random random = new Random();
		//랜덤의 사용 준비
		while(true) {
			System.out.println("게임시작: 1 , 게임종료: -1 ▶입력(콘솔)");
			//1.sc.nextLine() -> String 비교  equls
			//2.sc.nextLine() -> String -> int로 바꿔서 비교 ==
			String userData = sc.nextLine();//sc.nextLine()enterkey->userData
			if(!userData.equals("-1") && !userData.equals("1")) {
				System.out.println("잘못입력하셨습니다. !");
				continue;//<-반복문의 시작 블럭으로 이동.
			}
			if(userData.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			//개발자가 실제 게임에 관련 된 소스파일 작성
			System.out.println("주사위 게임을 시작합니다.");
			System.out.println("사용자가 주사위를 굴립니다.");
			System.out.println("Enter Key를 입력하세요.");
			sc.nextLine();//<-사용자가 콘솔창에서 Enter Key를 치기전까지
			// 대기.
			int userNum = random.nextInt(6)+1;
			//nextInt(6) 0~5 +1 1~6
			System.out.println("사용자의 숫자"+userNum);
			
			//컴퓨터가 주사위를 굴립니다.(콘솔창)
			System.out.println("컴퓨터가 주사위를 굴립니다.");
			sc.nextLine();
			int comNum = random.nextInt(6)+1;
			System.out.println("컴퓨터의 숫자" + comNum);
			//Enter Key를 입력해주세요.(Enter key 대기상태로 만듬)
			//int comNum = < 1~6
			//누가 이겼는지 if문으로 비교해서 출력.
			//사용자가 6 > 5?
			int aa = 0;
			if(userNum > comNum) {
				System.out.println("사용자의 승리!");
				int aa = 0;
			}
			else if(userNum < comNum) {
				int aa = 0;
				
				System.out.println("컴퓨터의 승리!");
			}
			else  {
				System.out.println("비겼습니다.");
			}
			
//			if(userData.equals("-1")) {
//				System.out.println("게임이 종료 되었습니다.");
//				break;
//			}else if(userData.equals("1")) {
//				//개발자가 실제 게임에 관련 된 코드를 입력하는 부분
//			}else {
//				System.out.println("잘못입력하셨습니다.");
//				//1또는 -1이 아닌경우에는 잘못입력하셨습니다.
//				//	&& AND 논리곱 모든 조건이 만족해야만 TRUE
//				//	(조건식1) && (조건식2)
//				//	TRUE 1    *  FALSE 0 = 0 ; 
//				//  || OR 논리합 하나의조건이라도 만족하면 TRUE
//				//	FALSE 0   + TRUE 1 = 1;
//			}
		}
		
	}
}
