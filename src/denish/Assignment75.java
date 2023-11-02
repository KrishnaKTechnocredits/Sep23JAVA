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
output : [e,p,a,q,a,c,t,b,u]*/
package denish;

import java.util.ArrayList;

public class Assignment75 {

	void multipleChar(ArrayList<Character> charList, char ch) {
		System.out.println(charList);
		if (charList.indexOf(ch) != charList.lastIndexOf(ch)) {
			charList.set(charList.indexOf(ch), 'a');
			charList.set(charList.lastIndexOf(ch), 'b');
		} else {
			System.out.print("given character having no multiple occurances ");
		}
		System.out.println(charList);
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

		new Assignment75().multipleChar(charList, 't');
	}
}
