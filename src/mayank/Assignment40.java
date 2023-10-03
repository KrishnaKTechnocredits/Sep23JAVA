//Assignment 40: 01-Oct-23
//WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
//Input: technocredits
//Output: echnocr

package mayank;

public class Assignment40 {
		
		void vowel(String input, char ch) {
			String output = "";
			for (int index = 0; index < input.length(); index++) {
				int firstIndex = input.indexOf(ch);
				int lastIndex = input.lastIndexOf(ch);
				output = input.substring(firstIndex,lastIndex);
			}
			System.out.println(output);
			
		}
		public static void main(String[] args) {
			 Assignment40 assignment40 =new Assignment40 ();
			 assignment40.vowel("technocredits", 'e');
		}
}
