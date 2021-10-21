package test_arraylist;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		//-책의 제목 , 출판사 , 가격 , 수량 , 저자
		//BookDTO
		//List<int> listTitle = new ArrayList<>();
		//참조타입의 데이터를 넣지 않아서 (요소) 에러x↑
		ArrayList<BookDTO> list = new ArrayList<>();
		BookDAO dao = new BookDAO();//?
		dao.getDisplay(list);
		//BookDAO.getDisplay(list);
	
	}
}
