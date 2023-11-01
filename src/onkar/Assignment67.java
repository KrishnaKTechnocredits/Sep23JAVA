/*using ternary operator, write a method to return operation code. : 
if operation is debit return 1,
if operation is credit return 2,
if operation is printBalance return 3,
for any other operation, return -1.

input -> "debit"
output -> 1*/

package onkar;

public class Assignment67 {
	int returnOperationCode(String operation) {
		return operation.equals("debit") ? 1 : operation.equals("credit") ? 2 : operation.equals("printBalance") ? 3 : -1; 
	}
	
	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		System.out.println("For debit operation, code is "+assignment67.returnOperationCode("debit"));
		System.out.println("For printBalance operation, code is "+assignment67.returnOperationCode("printBalance"));
		System.out.println("For any other operation operation, code is "+assignment67.returnOperationCode("printReceipt"));
		System.out.println("For credit operation, code is "+assignment67.returnOperationCode("credit"));
	}
}
