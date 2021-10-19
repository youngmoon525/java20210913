import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03_Lotto {
	public static void main(String[] args) {
		// 랜덤한 값으로 배열을 채운다.
		Random r = new Random();
		int[][] userLotto = null;
		Scanner sc = new Scanner(System.in);
		// 무한루프를 시작한다 . ~ 사용자가 -1을 입력할때까지.
		while (true) {
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.println("몇개를 구입하시겠습니까?");
					int cnt = Integer.parseInt(sc.nextLine());
					userLotto = new int[cnt][6];
					for (int k = 0; k < cnt; k++) {
						int[] tempLotto = new int[6];
						for (int i = 0; i < tempLotto.length; i++) {
							tempLotto[i] = r.nextInt(45) + 1;
							for (int j = 0; j < i; j++) {
								if (tempLotto[i] == tempLotto[j]) {
									i = i - 1;
								}
							}
						} // tempLotto라는 1차원배열은 우리가 원하는 값을가지고
							// 반복문을 빠져나온다.
						userLotto[k] = tempLotto;
					} // 유저가 입력한 장수만큼의 반복을 실행함.
					for (int i = 0; i < userLotto.length; i++) {
						System.out.println(Arrays.toString(userLotto[i]));
					}

				} else if (menu == 2) {
					System.out.println("몇개를 구입하시겠습니까?");
					int cnt = Integer.parseInt(sc.nextLine());
					userLotto = new int[cnt][6];
					for (int k = 0; k < cnt; k++) {
						int[] tempLotto = new int[6];
						for (int i = 0; i < tempLotto.length; i++) {
							System.out.println((i + 1) + "번째 숫자를 입력해주세요.");
							tempLotto[i] = Integer.parseInt(sc.nextLine());

							if (tempLotto[i] < 1 || tempLotto[i] > 45) {
								System.out.println("1~45까지의 수를 입력해주세요.");
								i = i - 1;
								continue;
							}
							for (int j = 0; j < i; j++) {
								if (tempLotto[i] == tempLotto[j]) {
									System.out.println("번째와 중복 된 숫자입니다.");
									i = i - 1;
								}
							}

							System.out.println(Arrays.toString(tempLotto));
						}
					}
					for (int i = 0; i < userLotto.length; i++) {
						System.out.println(Arrays.toString(userLotto[i]));
					}

				} else if (menu == -1) {
					System.out.println("로또 프로그램을 종료합니다.");
					break;// 로또 프로그램을 종료한다.(break를 통해 while문을 빠져나감)
				}

			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}

	}
}
