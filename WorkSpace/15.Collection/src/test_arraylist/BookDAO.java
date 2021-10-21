package test_arraylist;

import java.util.ArrayList;

public class BookDAO {


	//기능 
	//void , void가 아니냐,
	//static 이냐 static이 아니냐
	//리턴타입이없고 인스턴스멤버다.
	void getDisplay(ArrayList<BookDTO> list) {
		for (int i = 0; i < 5; i++) {
			list.add(new BookDTO("title"+i, "company"+i, 1, 2, "writer"+i));
			System.out.println(list.get(i).getTitle() );
		}
		for (BookDTO bookDTO : list) {
			System.out.println(bookDTO.getTitle());
		}
	}
}
