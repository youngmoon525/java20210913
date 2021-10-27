
public class Ex01HrDTO {
	private int employee_id	;	//number(6,0)
	private String first_name	;	//varchar2(20 byte)
	private String last_name	;	//varchar2(25 byte)
	private String email		;	//varchar2(25 byte)
	private String phone_number	;//varchar2(20 byte)
	//생성자 메소드 만들기.
	public Ex01HrDTO(int employee_id, String first_name, String last_name, String email, String phone_number) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
