package pack01_OOP;

public class Student {

	String name;
	int kor , eng , mat  , sum ;
	double avg; 
	//필드에 바로 접근을 막고(현재방식)
	//getter&setter메소드를 이용해서
	//필드에 접근하게 만든다(객체의 보안)
	
	
	//setter 메소드
	void setAvg() {
		avg = (double) sum /3 ;
	}
	void setSum() {
		sum = kor + eng + mat;
	}
	
}
