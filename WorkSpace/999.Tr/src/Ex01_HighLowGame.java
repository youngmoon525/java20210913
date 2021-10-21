import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Random r = new Random();
		int comNumber = r.nextInt(100) + 1;// 0~99 , +1 1~100
		System.out.println(comNumber);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int userNumber = Integer.parseInt(sc.nextLine());
			count++;
			if (comNumber < userNumber) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (userNumber < comNumber) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("총 시도 횟수:" + count);
				break;
			}
		}

	}
}
