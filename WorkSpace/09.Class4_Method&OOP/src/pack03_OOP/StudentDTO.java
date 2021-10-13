package pack03_OOP;

import java.util.Random;

public class StudentDTO {
	private String name ;//이름
	private String[] subject;//과목
	private int[] scores; //점수
	private String grade; //등급
	private int num ; //학생의번호
	
	public StudentDTO(String name, String[] subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
