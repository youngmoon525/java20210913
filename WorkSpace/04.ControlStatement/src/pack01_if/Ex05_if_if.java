package pack01_if;

import java.util.Scanner;

public class Ex05_if_if {
	public static void main(String[] args) {
		//중첩 if문 클래스를 제외한 어느 지역이든 제어문은 사용이 가능함.
		//지역 == { } 블럭킹을 가지고 있느냐. ==true 지역이 있다.
		//Scanner를 통해서 값을 입력
		//if문 0보다크면 if문 내부로 이동.
		//10보다 큰지 비교 10보다크면 
		//if문 내부로 이동 20보다크면 20보다 큽니다 라는 문자열을 콘솔에 출력
		//if(비교1){
			//if(비교2){
				//if(비교3){
				//}
			//}
		//}
		Scanner sc = new Scanner(System.in);
		//스캐너의 초기화식 (스캐너를 준비함)↑
		
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			System.out.println("0보다 큽니다.");
			if(num > 1) {
				System.out.println("1보다 큽니다.");
				if(num > 2) { //문제)<2보다 큽니다가 나올수있게 조건 수정.
					System.out.println("2보다 큽니다.");
				}
			}
			
		}
		
	}
}
