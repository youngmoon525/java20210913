package pack01_extends;
//extends가 사용 되기 전엔 각각 다른 클래스 임,Parent & Child 
//extends를 이용해서 자식클래스가 부모클래스를 고르게 되면(명시하게되면)
//그때는 부모와 자식 관계가 형성이 된다.
public class Child_Class extends Parent_Class {
	String child_field = "자식클래스 iv";
	public void childMethod() {
		System.out.println("자식클래스의 메소드");
	}
	
}
