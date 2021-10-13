package pack05_etc;

public class Ex05_Continue {
	public static void main(String[] args) {
		//break; == 반복문을 중단.
		//continue; ==반복문을 계속 진행.
		//홀수의 누적합(1~10까지의)
		int oddSum = 0;
		for(int i=1 ; i<=10; i++) {
		
			if(i % 2 == 1) {
				continue;
			}
			oddSum += i;
		
			//continue를 만나면 실행이 안되는 부분.
		}
		System.out.println(oddSum);
	}
}
