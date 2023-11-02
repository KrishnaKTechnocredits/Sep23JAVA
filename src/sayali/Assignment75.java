/* If given character having multiple occurrences 
then replace first occurrences with character 'a' 
and last occurrences of the same character with 'b'.
inputList = [e,p,t,q,a,c,t,t,u]
input : t
output : [e,p,a,q,a,c,t,b,u] */

package sayali;

import java.util.ArrayList;

public class Assignment75 {

	void replaceChar(ArrayList<Character> listOfChar, char ch) {

		System.out.println("Input: " + listOfChar);
		if (listOfChar.contains(ch)) {
			if (listOfChar.indexOf(ch) != listOfChar.lastIndexOf(ch)) {
				listOfChar.set(listOfChar.indexOf(ch), 'a');
				listOfChar.set(listOfChar.lastIndexOf(ch), 'b');
			}
		}
		System.out.println("\nOutput: " + listOfChar);
	}

	public static void main(String[] args) {

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
		Assignment75 ass75 = new Assignment75();
		ass75.replaceChar(charList, 't');
	}
}