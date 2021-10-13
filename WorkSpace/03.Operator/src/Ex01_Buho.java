
public class Ex01_Buho {
	public static void main(String[] args) {
		//부호라는 것은 정수나 숫자형 데이터들 앞에 + 또는 -를 붙여서
		//해당하는 숫자가 양수인지 음수인지를 나타낸것.
		//양수의 경우 +부호를 생략한다.(관례) 
		//+1 , +2 , -3 , -4 ,-5
		
		int x = -100; 
		
		int result = -x;// x(-100) 변수앞에 -x
		int result2 = +x;// x(-100) 변수앞에 +x
		System.out.println(result);//100
		System.out.println(result2);//-100
		//-부호를 어떤 변수 앞에 붙이게 되면 부호의 반전이 일어난다.
		//-x == -x * -1;
		//->+ , +>-
		int result3 = x * -1;//-x
		
		
		

	}
}
