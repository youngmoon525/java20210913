package pack01_extends;

public class Parent_Class {
//부모클래스 라는 개념은, 어떠한 클래스가 자식클래스로부터 선택 받는 순간,
//부모클래스가 된다.
	public String parent_field = "부모 클래스의 iv 인스턴스 멤버 입니다.";
	
	public void parentMethod() {
		System.out.println("부모 클래스의 iv 인스턴스 멤버 메소드입니다.");
	}
}
