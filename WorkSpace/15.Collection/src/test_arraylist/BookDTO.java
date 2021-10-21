package test_arraylist;

public class BookDTO {
//-책의 제목 , 출판사 , 가격 , 수량 , 저자
	private String title;
	private String company;
	private int price;
	private int cnt;
	private String writer;
	public BookDTO(String title, String company, int price, int cnt, String writer) {
		super();
		this.title = title;
		this.company = company;
		this.price = price;
		this.cnt = cnt;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
