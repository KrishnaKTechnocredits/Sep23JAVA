/* Assignment 41
WAP to print a string from first vowel input:pqrabcgtyes output:abcgtres
 */
package nivedita;

public class A41PrintFirst {
	
	void printString(String input) {
		String output = "";
		int x = 0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				x = input.indexOf(ch);
				break;
			}
		}
		output = input.substring(x);
		System.out.println("sub string is " + output);
	}

	
	public static void main(String[] args) {
		A41PrintFirst printFirst = new A41PrintFirst();
		printFirst.printString("pqrabcgtyes");
	}
	

}
