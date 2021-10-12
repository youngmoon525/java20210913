package pack01_OOP;
//Class : 특성(상태정보==속성) , 과 동작(행위정보)등이 기술(구현)되어있는 파일
public class Product {
	//인스턴스멤버(필드) 선언 : ▶ DTO Class(java기반) , VO Class(Web기반에서 네이밍룰)
	int num; //상품의 번호
	String name;//상품의 이름 ...
	
	//인스턴스 메소드(기능 , 행위정보) ▶DAO Class
	public void display() {
		System.out.println("num :" + num);
		System.out.println("name :" + name);
	}
}
