/* using ternary operator, write a method to return operation code. : 
if operation is debit return 1,
if operation is credit return 2,
if operation is printBalance return 3,
for any other operation, return -1.

input -> "debit"
output -> 1 */

package sayali;

public class Assignment67 {

	int getOperationCode(String operation) {
		return operation.equals("debit") ? 1 : operation.equals("credit") ? 2 : operation.equals("printBalance") ? 3 : -1;
	}

	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		System.out.println("Debit: " + assignment67.getOperationCode("debit"));
		System.out.println("Credit: " + assignment67.getOperationCode("credit"));
		System.out.println("PrintBalance: " + assignment67.getOperationCode("printBalance"));
		System.out.println("Cancel: " + assignment67.getOperationCode("cancel"));
	}
}