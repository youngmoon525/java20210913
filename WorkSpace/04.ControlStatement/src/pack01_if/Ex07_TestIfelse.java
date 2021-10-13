package pack01_if;

public class Ex07_TestIfelse {
	public static void main(String[] args) {
		//int형 데이터를 저장할수있는 변수 code라는 변수를 선언하고
		//값을 할당하면서 테스트합니다.
		//if else if문 사용해서 처리.
		//값이 1이면 콘솔창에 '남자'라고 출력이됨.
		//값이2이면 콘솔창에  '여자' , 3이면 남자 , 4이면 여자
		//그외에 값은 주민등록번호 오류.
		int code = 3;
		// && <- AND 연산자 , 그리고, 연결시켜놓은 모든 조건식을 만족해야만.true
		//(논리곱)
		// || <- OR 연산자 , 또는,연결시켜놓은 조건들중에 하나라도 만족하면 true
		//(논리합)
		//조건식1 true 이고 조건식2 true..........
		//조건식1 또는 조건이2 또는..........
		if(code == 1 || code == 3) {
			System.out.println("남자");
		}else if(code == 2 && code == 4) {
			System.out.println("여자");
		}else {
			System.out.println("입력오류");
		}
	}
}
