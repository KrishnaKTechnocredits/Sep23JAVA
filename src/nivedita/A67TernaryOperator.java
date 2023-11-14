/*Assignment-67 : 28th Oct'2023 using ternary operator, write a method to return
operation code. : if operation is debit return 1, if operation is credit return 2, 
if operation is printBalance return 3, 
for any other operation, return -1. input -> "debit" output -> 1*/

package nivedita;

public class A67TernaryOperator {

	int getOperation(String input) {
		return input.equals("debit") ? 1 : input.equals("credit") ? 2 : input.equals("printbalance") ? 3 : -1;
	}

	public static void main(String[] args) {
		A67TernaryOperator ternaryOp = new A67TernaryOperator();
		System.out.println("Debit operation performed -> "+ternaryOp.getOperation("debit"));
	}
}
