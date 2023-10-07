/*Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

sample input : 
	num1 : 10
	num2 : 17
	output : 10 is smaller between 10 and 17.
	         
sample input : 
	num1 : 10
	num2 : 17
	output : 17 is bigger between 10 and 17.*/

package mohit;

public class Assignment_7 {

	void maximum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is bigger between the " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is bigger between the " + num1 + " and " + num2);
		}
	}

	void minimum(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller between the " + num1 + " and " + num2);
		} else {
			System.out.println(num1 + " is smaller between the " + num1 + " and " + num2);
		}

	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.maximum(10, 17);
		assignment_7.minimum(10, 17);
	}
}
