package technoCredits.interview;

public class Student {

	int rno;
	String name;
	String city;
	double score;
	char grade;

	public Student(int rno, String name, String city, double score, char grade) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
		this.score = score;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name + "->" + rno;
	}

	@Override
	public int hashCode() {
		return rno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		return this.name.equals(std.name) && this.rno == std.rno; 
	}
}
