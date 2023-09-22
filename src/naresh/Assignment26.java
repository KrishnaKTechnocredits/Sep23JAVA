
package naresh;

public class Assignment26 {

	void cheqFreq(String input) {
		while (input.length() > 0) {
			char ch = input.charAt(0);
			int orglen = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newlen = input.length();
			System.out.println(ch + "->" + (orglen - newlen));

		}

	}

	public static void main(String[] args) {
		Assignment26 a = new Assignment26();
		a.cheqFreq("aakanksha");

	}

}
