package pack01_if;

public class Ex04_if_if {
	public static void main(String[] args) {
		if(true) {
			int score = 0;
			if(true) {
				score = 10;
				int score2 = 0;
			}//if문 끝 블럭
			score2 = 0;
		}//if문 끝 블럭
		score = 10;
		score2 = 10;
		
	}//main메소드의 끝 블럭
}


