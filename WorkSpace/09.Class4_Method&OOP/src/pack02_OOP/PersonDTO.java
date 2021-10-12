package pack02_OOP;

public class PersonDTO {
	//Data Transfer Object
	String name ;
	int age;
	double height , weight ;
	String gender;
	

	//생성자 메소드 
	public PersonDTO(String name, int age, double height, double weight, String gender) {
		super();			
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	
}
