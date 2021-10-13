import java.util.Scanner;

public class Ex08_TestBool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//스캐너를 사용하기 위한 스캐너 초기화
		//String inputData = sc.nextLine();
		//sc.nextLine() <- 프로그램은 대기 상태(blockState)
		//콘솔창에서 enterKey를 누르기 전까지 대기를하다가 누른 순간에
		//콘솔창에 입력된 값들을 String형태로 return(반환) 
		//System.out.println("콘솔창에 입력 한 값 : " + inputData);
		//스캐너를 사용해서 str1 = sc.nextLine();
		//			    str2 = sc.nextLine();
		// str1 과 str2이 값이 같은지를 비교해서 출력해보세요.
		// str1 -> Integer , str2 -> Integer
		// 같은 숫자인지의 비교를 하시오.
		
		String str1 = sc.nextLine(); //엔터키를 한번 쳤을때까지의 결과
		String str2 = sc.nextLine(); //엔터키를 한번 쳤을때까지의 결과
		System.out.println(str1 + str2);
		int int1 = Integer.parseInt( str1 ); 
		int int2 = Integer.parseInt( str2 );
		String result = int1 == int2 ? "같음" : "다름";
		System.out.println(result);
		//"10" = > 10 Wrapper Class == Integer 
		int int3 = Integer.parseInt( sc.nextLine() );
		System.out.println(int3);
		
		
		
	}
}
