package pack05_etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		//스캐너. 콘솔창에 입력 된 값을 가져와서 사용하기위한.
		//사용자가 입력한 값이 특정한 값이 경우에 while문을 종료.
		Scanner sc = new Scanner(System.in);
		//스캐너의 초기화 식↑
		
		while(true) {
			String inputData = sc.nextLine();  
			//equals는 문자열의 비교 == x
			if(inputData.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			System.out.println("사용자가 입력한값"+inputData);
		}
		//콘솔창에 어떤값을 입력하고 엔터키를 치기 전까지
		//프로그램을 대기함. 그리고 엔터를 쳤을때
		//그 값을 String 형태로 넘겨줌.
	}
}
