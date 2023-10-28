/*Assignment-67 : 28th Oct'2023
using ternary operator, write a method to return operation code. : 
if operation is debit return 1,
if operation is credit return 2,
if operation is printBalance return 3,
for any other operation, return -1.
input -> "debit"
output -> 1*/

package jaykumar;

public class Assignment67 {
	
	int getOpCode(String operation) {
		return operation.equals("debit") ? 1 : operation.equals("credit") ? 2 : operation.equals("printBalance") ? 3 : -1;
	}

	public static void main(String[] args) {
		Assignment67 a = new Assignment67();
		System.out.println("For debit operation: "+a.getOpCode("debit"));
		System.out.println("For credit operation:"+a.getOpCode("credit"));
		System.out.println("For printBalance operation:"+a.getOpCode("printBalance"));
		System.out.println("For transferMoney operation:"+a.getOpCode("transferMoney"));
		
	}
}
