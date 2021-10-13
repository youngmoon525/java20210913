package pack03_OOP;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		//데이터 한건을 dto에 넣고 테스트.
		String[] subjects = { "과목1" , "과목2" , "과목3"};
		int[] scores = {10 , 20 , 30};
		//[과목1] [과목2] [과목3]
		StudentDTO[] dto = {
				new StudentDTO("학생1", subjects),
				new StudentDTO("학생2", subjects),
				new StudentDTO("학생3", subjects)
		
		};
		// {  [dto 
		//		{ String name , String[] subjects }
		//] [학생2] [학생3] }
		StudentDAO dao = new StudentDAO();
		dao.display(dto, scores);
		dao.setGrade(dto);
		dao.displaySum(dto, scores);
		dao.displayAvg(dto, scores);
		
		dto = dao.addStudent(dto);//3건 => 4건의 정보를 받음
		dao.display(dto, scores);
		dao.displaySum(dto, scores);
		dao.displayAvg(dto, scores);
	}
}
