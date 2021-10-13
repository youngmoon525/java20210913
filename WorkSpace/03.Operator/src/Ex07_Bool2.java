
public class Ex07_Bool2 {
	public static void main(String[] args) {
		// 1 + 1 = 2;
		// == (같은지의 비교)
		int a = 10;				//? "true" : "false";
		String result = a == 10 ? "같다" : "다르다";
		//a라는 변수가 10이라는 값이 맞습니까? 같다 : 다르다
		System.out.println(result);
		// != (다른지의 비교)
		result = a != 10 ? "다르다" : "같다";
		//a라는 변수가 10이라는 값이 아닙니까? 
		System.out.println(result);
	}
}
