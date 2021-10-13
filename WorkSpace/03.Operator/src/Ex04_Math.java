
public class Ex04_Math {
	public static void main(String[] args) {
		//사칙연산 + - * / , + 나머지를 구하는방법 %
		//나머지가 프로그램에서 중요한 이유는
		//어떠한 값이 홀수인지 짝수인지를 나머지로 구분할수가있다.
		//어떤 값을 2로 나누고나서 나머지가 1이다 == 홀수
		//어떤 값을 2로 나누고나서 나머지가 0이다 == 짝수
		
		
		
		
		int v1 = 5;
		int v2 = 2;
		//더하기
		int result ; // 선언만 result (아직 값이 없는 상태)
		
		result = v1 + v2; 
		System.out.println("v1 + v2 = " + result);
		// 빼기 , 나누기 , 곱하기 연산을 v1 , v2 두변수를 이용해서 하는데
		// 그결과를 result라는 변수에 재할당하고 출력하세요.
		result = (v1 - v2);
		System.out.println("v1 - v2 = " + result);
		
		result = (v1 * v2);
		System.out.println("v1 * v2 = " + result);
		
		result = (v1 / v2);
		System.out.println("v1 / v2 = " + result);
		
		//나머지를 구하는것은 %
		result = (v1 % v2);
		System.out.println("v1 % v2 = " + result);
		//어떤값 x 가 홀수인지 짝수인지는 그값을 2로 나눴을때 나머지가 0이면 짝수이다.
		//x % 2 == 1이면 홀수 , 0이면 짝수
		//5 % 2 == 1 (5는 홀수이다)
		
		
	}
}
