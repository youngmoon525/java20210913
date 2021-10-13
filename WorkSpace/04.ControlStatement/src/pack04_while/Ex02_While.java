package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		//1.초기값(조건식의 기준이되는값)
		//2.조건식
		//3.증감식
//		int i = 0 ;
//		while(i<10) {
//			System.out.println(i);
//			//프로그램이 무한루프를 함 (i < 10 ) == true
//			if(i % 2 == 0) {
//				System.out.println("짝수입니다.");
//			}else {
//				System.out.println("홀수입니다.");
//			}
//			i++;
//		}//while
		
		//while문만을 이용해서 구구단 출력
		//while문을 두개 중첩해서 구구단을 출력하시오.
		int i = 1;
	
		while(i<10) {
			int j = 1;
			System.out.println("i값:" + i + " j값 :" + j);
			while(j<10) {
				System.out.println(i + " * "+ j + "=" + (i*j) );
				j++;
			}
			i++;
		}
		
	}
}
