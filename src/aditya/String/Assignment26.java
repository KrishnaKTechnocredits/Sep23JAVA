//Print the freq of all character using while loop.
package aditya.String;

public class Assignment26 {
	void display(String input) {

		while (input.length() > 0) {
			int Olen = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newlen = input.length();
			System.out.println(ch + " --->" + (Olen - newlen));
		}
	}

	public static void main(String[] args) {
		Assignment26 p = new Assignment26();
		p.display("aakansha");
	}
}
