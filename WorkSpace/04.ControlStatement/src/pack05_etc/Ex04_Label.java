package pack05_etc;

public class Ex04_Label {
	public static void main(String[] args) {
		//중요도 매우 낮음 , 사용 빈도 매우 낮음
		int i = 0;	
		LABEL:
		while(true) {
			i++;
			System.out.println(i);
			if(i==10) {
				break LABEL;
				//LABEL은 세트로 사용한다.
				//LABEL : 
				//break LABEL; 세트. break 라벨이름을 사용하면 미리 지정해놓은
				//라벨의 구역으로 프로그램 순서가 이동한다.
				//단 이미 실행 된 반복문은 다시 실행하지 않는다.
			}
		}
		System.out.println("라벨로 빠져나옴");
	}
}
