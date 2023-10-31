/*using ternary operator WAP to return operation code.
if operation is debits return 1, if operation is credit return 2 
if operation is printBalance return 3 for any other operation return -1 */

package akshita.array;

import java.util.Scanner;

public class Assignment67 {

	void operation() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Which operation you want to perform Credit/Debit/PrintBalance : ");
			String oper = sc.next();
			System.out.println("Input : " + oper);
			int output = oper.equalsIgnoreCase("Debits") ? 1
					: oper.equalsIgnoreCase("Credits") ? 2 : oper.equalsIgnoreCase("printBalance") ? 3 : -1;
			System.out.println("Output :" + output);
			
			System.out.println("Do you want to continue? Yes/NO");
			String conf = sc.next();
			if (conf == "No") {
				break;
			}
			continue;
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		Assignment67 ass67 = new Assignment67();
		
		
		
		ass67.operation();
	}
}
