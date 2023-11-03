/*Assignment-75 : 2nd Nov'2023

If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.

ArrayList<Character> charList = new ArrayList<Character>();
charList.add('e');
charList.add('p');
charList.add('t');
charList.add('q');
charList.add('a');
charList.add('c');
charList.add('t');
charList.add('t');
charList.add('u');

input : t
output : [e,p,a,q,a,c,t,b,u]
*/

package deepak;

import java.util.ArrayList;

public class Assignment75_ReplaceObjectArrayList {

	ArrayList<Character> replaceChar(ArrayList<Character> input, char ch) {
		System.out.println("Input : " + input);
		if (input.indexOf(ch) != input.lastIndexOf(ch)) {
			input.set(input.indexOf(ch), 'a');
			input.set(input.lastIndexOf(ch), 'b');
		} else
			System.out.println(ch + " is not in the list or is not a repeating character!");
		return input;
	}

	public static void main(String[] args) {
		Assignment75_ReplaceObjectArrayList output = new Assignment75_ReplaceObjectArrayList();
		ArrayList<Character> charList = new ArrayList<Character>();
		charList.add('e');
		charList.add('p');
		charList.add('t');
		charList.add('q');
		charList.add('a');
		charList.add('c');
		charList.add('t');
		charList.add('t');
		charList.add('u');

		System.out.println("Output : " + output.replaceChar(charList, 't'));

	}
}
