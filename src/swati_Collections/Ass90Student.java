package swati_Collections;

public class Ass90Student implements Comparable<Ass90Student> {

	String name;
	int rno;
	int marks;
	String city;

	public Ass90Student(String name, int rno, int marks, String city) {
		this.name = name;
		this.rno = rno;
		this.marks = marks;
		this.city = city;
	}

	public int compareTo(Ass90Student std) {
		return this.marks - std.marks;
	}

	@Override
	public String toString() {
		return name + ":" + rno + ":" + marks + ":" + city;
	}
}
