/*Assignment-67 : 28th Oct'2023

using ternary operator, write a method to return operation code. : 
if operation is debit return 1,
if operation is credit return 2,
if operation is printBalance return 3,
for any other operation, return -1.

input -> "debit"
output -> 1
*/
package roshani;

public class Ass67TernaryOp{
	
	int getOperation(String operation){
		return operation.equals("debit") ? 1 : operation.equals("credit")? 2 : operation.equals("printBalance") ? 3 : -1;
	}
	
	public static void main(String[] args){
		Ass67TernaryOp assignment67 = new Ass67TernaryOp();
		System.out.println("Debit operation is performed : " +assignment67.getOperation("debit"));
		//System.out.println("Credit operation is performed : " +assignment67.getOperation("credit"));
		//System.out.println("Print Balance operation is performed : " +assignment67.getOperation("printBalance"));
		//System.out.println("Other operation is performed: " +assignment67.getOperation("otherOperation"));
	}
}