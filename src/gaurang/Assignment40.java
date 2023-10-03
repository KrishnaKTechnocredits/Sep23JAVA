/*WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr*/

package gaurang;

public class Assignment40 {

	void getString(String input,char ch) {
		int initial = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String update = input.substring(initial, last);
		System.out.println("Required output is "+update);
	}
	
	public static void main(String[] args) {
		Assignment40 a = new Assignment40();
		a.getString("technocredits", 'e');
	}
}
