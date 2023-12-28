package ch17.sec12.exam01;

public class Student {
	private String name;
	private String se;
	private int score;
	public Student(String name, String se, int score) {
		this.name = name;
		this.se = se;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public String getSe() {
		return se;
	}
	public int getScore() {
		return score;
	}
	
}

