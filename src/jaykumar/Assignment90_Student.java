/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package jaykumar;

public class Assignment90_Student implements Comparable<Assignment90_Student>{

	String name;
	int rno;
	int marks;
	String city;
	
	public Assignment90_Student(String name, int rno, int marks, String city){
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
