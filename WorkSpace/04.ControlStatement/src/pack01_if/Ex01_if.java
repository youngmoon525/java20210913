package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		//if ( true / false ){
		
		//}
		//조건식 : 반드시 true , false를 반환할수있는 조건식
		//조건식 : 반드시 네 또는 아니오 (참 , 거짓 ) (true , false)
		//조건식이 될수 없는것 : 1+1 , 니이름이 뭐니?...  x
		//조건식이 될 수 있는것 : (1+1)==2 , 니이름은 ㅇㅇㅇ이냐 ? 
		int score = 90;
		if(score >= 90) {// 91부터 조건식이 true
			//if문의 조건식이 true (참일때 실행되는 부분)
			int result = 0;//지역 변수
			System.out.println("score는 90보다 큽니다.");
		}
		if(score <= 90) {// 89부터 조건식이 true
			//if문의 조건식이 true
			System.out.println("score는 90보다 작습니다.");
		}
		
		
		
	
	}
}
