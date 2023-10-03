/*WAP to print a string from first repeating vowel 'e'to last repeating vowel 'e'
 * input:technocredits
 * output:echnocr
 */


package hetal;

public class Assignment40 {
	
	void printString(String input,char ch) {
		int f = input.indexOf(ch);
		int l = input.lastIndexOf(ch);
		String output = input.substring(f, l);
		System.out.println("sub string is " + output);
	}
	
		
	public static void main(String[] args) {
		Assignment40 a = new Assignment40();
		a.printString("technocredits",'e');
	}

}
