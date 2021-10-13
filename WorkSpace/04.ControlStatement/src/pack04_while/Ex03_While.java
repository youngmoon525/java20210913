package pack04_while;

public class Ex03_While {
	public static void main(String[] args) {
		//While문만 사용해서.
		//문제1) 1부터 10까지의 누적합(sum)을 구하시오.
		//int sum ; 
//		문제1)
//		int sum = 0;
//		for(int i = 1 ; i<=10; i++) {
//			sum += i ;
//			System.out.println(i);
//			System.out.println("sum : " + sum);
//		}
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		//문제2)
		//for문을 중첩시켰다.( for문 i=1<=5 안에 for j=1 j<=i문
		//★
		//★★
		//★★★
		//★★★★
		//★★★★★
		for(int k = 1 ; k<=5; k++) {
			for(int j = 1; j<=k; j++) {
				System.out.print("★" + k);
			}
			System.out.println();
		}
		
		int k = 1;
		while(k<=5) {
			int j = 1;
			while(j<=k) {
				System.out.print("★");
				j++;
			}
			System.out.println();
			k++;
		}
		
		
		
	}
}
