package pack01_OOP;

public class Student02Main {
	public static void main(String[] args) {
		Student02 s1 = new Student02();
		s1.name = null;//필드에 바로 접근해서 넣으면 안되는값을 세팅해도 그대로 값이 대입이됨
		s1.setName(null);
		s1.kor = -100;
		s1.setKor(-100);
		System.out.println(s1.kor);
		System.out.println(s1.name);
	}
}
