/*Assignment-75 : 2nd Nov'2023
If given character having multiple occurances 
then replace first occurances with character 'a' 
and last occurances of the same character with 'b'.
inputList = [e,p,t,q,a,c,t,t,u]
input : t
output : [e,p,a,q,a,c,t,b,u]*/

package jaykumar;

import java.util.ArrayList;

public class Assignment75 {

	void replaceCharinArrayList(ArrayList<Character> listOfChar, char ch) {
		System.out.println("Given list of char: "+listOfChar);
		if (listOfChar.contains(ch)) {
			if (listOfChar.indexOf(ch) != listOfChar.lastIndexOf(ch)) {
				listOfChar.set(listOfChar.indexOf(ch), 'a');
				listOfChar.set(listOfChar.lastIndexOf(ch), 'b');
			}
		}
		System.out.println("List of char after replace: "+listOfChar);
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
		Assignment75 a = new Assignment75();
		a.replaceCharinArrayList(charList, 't');

	}
}
