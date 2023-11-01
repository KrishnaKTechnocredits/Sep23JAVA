//Assignment-67 : 28th Oct'2023
//
//using ternary operator, write a method to return operation code. : 
//if operation is debit return 1,
//if operation is credit return 2,
//if operation is printBalance return 3,
//for any other operation, return -1.
//
//input -> "debit"
//output -> 1

package yogesh;

public class Yogesh_Assignment67 {

	int getTernary(String operation) {

		return operation.equals("debit") ? 1
				: operation.equals("credit") ? 2 : operation.equals("printBalance") ? 3 : -1;

	}

	public static void main(String[] args) {
		Yogesh_Assignment67 assignment67 = new Yogesh_Assignment67();
		System.out.println(assignment67.getTernary("debit"));
		System.out.println(assignment67.getTernary("credit"));
		System.out.println(assignment67.getTernary("printBalance"));
		System.out.println(assignment67.getTernary("operation"));
	}
}
