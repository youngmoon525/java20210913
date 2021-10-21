package pack03_Stack;

import java.util.Stack;

public class StackMain {
	public int a = 0;
	//인스턴스 멤버의 규칙: 인스턴스화 하지않으면 접근이 불가능.
	//STATIC은 : 인스턴스화 하지않아도 접근이 가능
	public static void main(String[] args) {
		//받아오고싶음 (coin의 값을)
		//받아온다음에 syso 바로 출력해보고싶음
		//Coin <-인스턴스화 해서 객체로 만들어보기
		StackMain s = new StackMain();
		Coin coin1 = s.new Coin(100);
		Coin coin2 = new StackMain().new Coin(100);
		Stack<Coin> coinBoxSt = new Stack<>();
		coinBoxSt.push(s.new Coin(100));
		coinBoxSt.push(s.new Coin(50));
		coinBoxSt.push(s.new Coin(500));
		coinBoxSt.push(s.new Coin(10));
		//Lifo구조 Last In First Out
		//System.out.println(coinBoxSt.pop());
		while(!coinBoxSt.isEmpty()) {
			Coin coin = coinBoxSt.pop();
			System.out.println(coin.value);
		}
		System.out.println("==========stack");
	}//main
	
	public class Coin{
		private int value;
		
		public Coin(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}


}
