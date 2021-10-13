package pack01_if;

public class Ex06_if_esif {
	public static void main(String[] args) {
		//다중 if 문 : 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행.
		//기존 ex) if(조건식){만족했을때 실행 if(조건식){ } }
		//        else    {만족하지 못한경우 실행}
		//다중 if 문
		//if(조건식1){
		// 조건식 1을 만족하는 경우에 실행부
		//}else if(조건식 2){
		// 조건식 2를 만족하는 경우에 실행부
		//}else if(조건식 3){
		//
		//}else{
		//	모든 조건식을 만족하지 못한경우 실행부.
		//} if (else if).......  else
		
		int score = 80; //int형 변수 score에 값 87을 주고 초기화
		//점수가 70점 미만이고 60점 이상인 점수면 D학점을 출력할수있게 프로그램을
		//수정해보세요.
		if ( score >= 90 ) {
			System.out.println("A학점이다.");
		}else if(score >= 80) {
			System.out.println("B학점이다.");
		}else if(score >= 70) {
			System.out.println("C학점이다.");
		}else {
			System.out.println("F학점이다.");
		}
		
		
		
		
	}
}
