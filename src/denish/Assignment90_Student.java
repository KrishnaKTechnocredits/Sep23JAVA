package denish;

public class Assignment90_Student implements Comparable<Assignment90_Student> {

	String name;
	int rno;
	int marks;
	String city;

	public Assignment90_Student(String name, int rno, int marks, String city) {
		this.name = name;
		this.rno = rno;
		this.marks = marks;
		this.city = city;
	}

	public int compareTo(Assignment90_Student std) {
		return this.marks - std.marks;
	}

	@Override
	public String toString() {
		return name + ":" + rno + ":" + marks + ":" + city;
	}
}
