package pack02_Anonymous;

public class Button {
	//background , img , id ....
	//button을 클릭했을때 어떤 처리를 할것인지.
	public OnClickListner listner;//Button객체의 필드
	//온클릭 리스너를 사용자로부터 초기화 시킴.
	void setOnclickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void click() {
		listner.onClick();
	}
	
	//static interface를 중첩. (Button객체 안에 interface를 넣는다)
	//interface라는것은 메소드 만드는것을 강제한다 (abstacts)
	static interface OnClickListner{
		void onClick(); //OnClickListner라는 애를 사용하기위해서는
						//onClick 이벤트가 반드시 있어야한다.
	}
}
