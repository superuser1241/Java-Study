package ex0807.ex02;
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Student o) {
		//return score - o.getScore();
		return Integer.compare(score, o.getScore());
	}
	
}