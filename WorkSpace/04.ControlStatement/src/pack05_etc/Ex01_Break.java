package pack05_etc;

public class Ex01_Break {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("반복문을 종료함.");
			break;
		}
		int i = 0;
		while(true) {//무한 반복하는 반복문
			System.out.println(i);
			if(i == 20) {
				break;
			}
			i++;
		}
		for(int j = 0 ; j<100; ) {
			if(j==0) {
				System.out.println("break로 정지");
				break;
			}
		}
		//반복문은 break를 만나게 되면 무조건 빠져나감.
		
		
		
	}
}
