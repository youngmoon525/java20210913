package pack06_Type;

public class Ex00_Casting {
	public static void main(String[] args) {
		int a = 10 ; //정수형 변수 a를 선언, 값(10을 할당) ▶ 초기화
		double b = a; 
		//▶묵시적 형변환, UpCasting
		//자동형변환이 발생함 작은 타입 (int)이 큰 타입(double)로 자동 변환
		//일반적인 의미의 캐스팅이 x
		System.out.println(a);
		System.out.println(b);
		
		//큰타입(double)에서 작은타입(int)로 가는 경우
		//DownCasting ,강제 형변환
		//일반적인 의미의 캐스팅 O
		double c = 14.5; //큰타입 (double) 
		int d =(int) c;//소괄호()사이에 데이터타입을 명시해주면 downCasting 
		System.out.println(c);
		System.out.println(d);
		//14.5 -> 14 
		//데이터가 소실이 된다. (DownCasting) 
		
	}
}
