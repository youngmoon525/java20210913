package pack02_OOP;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		//사용자가 입력한값 View단이 없을때는 항상 Console
		//Scanner 이용.
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력해주세요.");
		String id = sc.nextLine();//사용자가 엔터키를 치는순간까지 입력된값을 반환받음.
		System.out.println("비밀번호를 입력해주세요.");
		String pw = sc.nextLine();
		LoginDTO dto = new LoginDTO(id , pw);
		System.out.println(dto.id);
		System.out.println(dto.pw);
		LoginDAO dao = new LoginDAO();
		if(dao.login(dto) ) {
			//return type이 boolean이기때문에 반드시 true,false의 값을 반환받을수있다.
			//따라서 반환되는 데이터를 if문의 조건으로 사용이 가능하다.
			System.out.println(id + "님 로그인이 되었습니다.");
		}else {
			System.out.println("아이디나 비밀번호를 확인해주세요.");
			
		}
	}
}
