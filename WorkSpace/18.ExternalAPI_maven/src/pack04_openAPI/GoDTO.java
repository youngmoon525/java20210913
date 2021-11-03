package pack04_openAPI;

public class GoDTO {
	private String title;//상호
	private String location;//소재지
	private String tel;//연락처
	private int num ;//연번
	private String menu ;//주메뉴
	
	public GoDTO(String title, String location, String tel, int num, String menu) {
		super();
		this.title = title;
		this.location = location;
		this.tel = tel;
		this.num = num;
		this.menu = menu;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
}
