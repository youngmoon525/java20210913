package pack03_for;

public class Ex01_for {
	public static void main(String[] args) {
		//for(1.초기값; 2.조건식; 3.증감식){
		//		4.실행부
		//}
		//1.초기값: 조건문의 기준(조건문을 시작할때의 수) 0~ 
		//2.조건식: 조건식이 TRUE일 동안 계속해서 반복을함 
		//3.증감식: 조건식에 증감식이 빠지거나 잘못들어가면 프로그램은 무한루프를 한다.(error)
		//4.실행부: 조건식이 TRUE일때 실행하는 부분.
		for(int i = 1 ; i<=10; i++) {
			System.out.println(i);
		}
		//직접 for문을 하나 만들고 
		// 10 ~ 20까지 콘솔창에 출력할수있게.
		//10
		//11
		for(int i = 10 ; i<=20 ; i++) {
			System.out.println(i);
		}
		for(int i = 10 ; i>1; i--) {
			System.out.println(i);
		}
		//100 ~ 1
		//.....20
		
		
		
		
		
		System.out.println("=====");
		//0에서 9까지의 정수 중에서 짝수만 출력 : for
		//0,2 , 4 , 6 , 8 ( + 2)
		for(int i = 0 ; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("=====");
		
		for(int i = 0 ; i < 10; i++) {
			//0~9
			if(i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}else {
				System.out.println("홀수 : " + i);
			}
		}
		
		//1부터 100까지의 정수 (숫자) 중에서 '홀수만' 콘솔창에 출력하세요.
		for(int i=0; i<100; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
	}
}
