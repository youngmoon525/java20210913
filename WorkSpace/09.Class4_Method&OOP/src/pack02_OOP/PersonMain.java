package pack02_OOP;

import java.util.Arrays;

public class PersonMain {
	public static void main(String[] args) {
		PersonDTO[] persons = new PersonDTO[5];
		//persons라는 *배열 (요소로 PersonDTO를 가지는 )
		//을 0번부터 배열의 끝 인덱스까지 모두 인스턴스화 시키고 값을 출력을 1건만해보세요.
		//PersonDTO person = new PersonDTO();
		//PersonDTO dto1 = new PersonDTO("홍길동", 50, 170, 70, "남");
		//PersonDTO dto2 = new PersonDTO("홍길동", 50, 170, 70, "남");
		//PersonDTO dto3 = new PersonDTO("홍길동", 50, 170, 70, "남");
		persons[0] = new PersonDTO("홍길동", 50, 170, 70, "남");
		persons[1] = new PersonDTO("춘향", 30, 168, 70, "여");
		persons[2] = new PersonDTO("춘향3", 30, 168, 70, "여");
		persons[3] = new PersonDTO("춘향333", 80, 168, 70, "여");
		persons[4] = new PersonDTO("춘향홍길동", 80, 168, 70, "여");
		System.out.println(Arrays.toString(persons));
		//메소드 호출하기.
		//PersonDAO display();
		PersonDAO dao = new PersonDAO();
		//dao의 인스턴스화
		dao.display(persons);
		dao.displayMan(persons);
		dao.displayWoman(persons);
		String inputData = "홍길동";
		System.out.println("===");
		dao.displayKeword(persons, inputData);
		dao.displayMaxAge(persons);
		
		
		
//      String배열을 예로들어↓
//		String[] arr = new String[3];
//		arr[0] = "1";
//		arr[1] = new String("aa");
//		System.out.println(Arrays.toString(arr));
	}
}
