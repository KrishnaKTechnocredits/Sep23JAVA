/* Assignment 40
WAP to print a string from first repeating vowel 'e'to last repeating vowel 'e' input:technocredits output:echnocr
 */


package nivedita;

public class A40PrintRep {
	
	void printString(String input,char ch) {
		int f = input.indexOf(ch);
		int l = input.lastIndexOf(ch);
		String output = input.substring(f, l);
		System.out.println("sub string is " + output);
	}
	
		
	public static void main(String[] args) {
		A40PrintRep printRep = new A40PrintRep();
		printRep.printString("technocredits",'e');
	}

}
