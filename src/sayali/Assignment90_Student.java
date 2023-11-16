/* WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package sayali;

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

	public int compareTo(Assignment90_Student stud) {
		return this.marks - stud.marks;
	}

	@Override
	public String toString() {
		return name + ":" + rno + ":" + marks + ":" + city;
	}
}