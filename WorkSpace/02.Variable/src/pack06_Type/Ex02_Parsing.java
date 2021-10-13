package pack06_Type;

public class Ex02_Parsing {
	public static void main(String[] args) {
		//String 문자열 , int 숫자
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);
		//String변수는 + 를 하게 되면 연결이된다(결합)
		int int1 = 10;
		int int2 = 20;
		System.out.println(int1 + int2);
		//String - > int Parsing 
		//Integer라는 Wrapper Class
		//Wrapper Class .parseInt(Str1); "더블코테이션을 제거"
		int int3 = Integer.parseInt(str1);
		int int4 = Integer.parseInt(str2);
		System.out.println(int3+int4);
		//어떠한 변수든 뒤에 String을 더하게 되면 그변수는 String이 된다.
		//3 + ""; => "3";
		String str3 = int3+"";//10 => "10"; 숫자x 문자열
		String str4 = int4+"";//20 => "20"; "10"+"20" == 
		System.out.println(str3+str4);
	}
}
