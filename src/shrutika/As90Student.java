/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package shrutika;

public class As90Student implements Comparable<As90Student> {

	String name;
	int rno;
	int marks;
	String city;

	public As90Student(String name, int rno, int marks, String city) {
		this.name = name;
		this.rno = rno;
		this.marks = marks;
		this.city = city;
	}

	public int compareTo(As90Student std) {
		return this.marks - std.marks;
	}

	@Override
	public String toString() {
		return name + ":" + rno + ":" + marks + ":" + city;
	}
}
