package pack01_extends;

public class Extends_Main {
	public static void main(String[] args) {
		//부모클래스 ( 기능을 먼저 정의해놓은 클래스 )
		//자식클래스 ( 부모클래스의 기능을 물려받고 + 다른기능을 구현)
		//부모클래스 == SUPER CLASS
		//super();
		Child_Class cc = new Child_Class();
		System.out.println(cc.child_field);
		cc.childMethod();
		System.out.println(cc.parent_field);
		cc.parentMethod();
		System.out.println("=================");
		Parent_Class pc = new Parent_Class();
		System.out.println(pc.parent_field);
		pc.parentMethod();
	}
}
