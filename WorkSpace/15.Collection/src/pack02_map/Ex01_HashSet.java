package pack02_map;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//Inerface를 impleaments받은 객체(Class)들은
		//Interface를 초기화시킬수있다. (생성자메소드)
		set.add("Java1");//
		set.add("Java2");//
		set.add("Java3");//
		set.add("Java4");//
		set.add("Java5");//
		set.add("Java6");//
		boolean aa = set.add(new String("Java6"));//
		System.out.println(aa);
		//for Upgrade => 향상 된 For문 //
		//조건식이 없는 for문
		//반복을 하면서 데이터가 있다면 받을 변수를 지정하고
		//변수를 빼올(항아리) 자료구조를 써주는 형식.
		//for == foreach
		//for( 빼올 데이터로 변수 선언 : 빼올 자료구조(항아리){ }
		for(String element : set) {
			System.out.println(element);
		}
		set.clear();//set에 있는 내용을 비운다.
		//is <- 메소드 boolean을 return has
		if(set.isEmpty()) {
			System.out.println("비어있습니다.");
		}else {
			System.out.println("안비어있습니다.");
		}
	}
}
