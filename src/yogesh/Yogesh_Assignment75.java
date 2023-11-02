//If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.
//
//ArrayList<Character> charList = new ArrayList<Character>();
//charList.add('e');
//charList.add('p');
//charList.add('t');
//charList.add('q');
//charList.add('a');
//charList.add('c');
//charList.add('t');
//charList.add('t');
//charList.add('u');
//
//input : t
//output : [e,p,a,q,a,c,t,b,u]
package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment75 {

	void occurance(ArrayList<Character> charList, char ch) {
		System.out.println("Input1:--"+charList);
		int firstIndex = charList.indexOf(ch);
		int lastIndex = charList.lastIndexOf(ch);

		if (firstIndex != -1) { // Check if the character is present at all
			charList.set(firstIndex, 'a'); // Replace first occurrence
			if (lastIndex != firstIndex) { // Check if there is more than one occurrence
				charList.set(lastIndex, 'b'); // Replace last occurrence
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment75 assignment75 = new Yogesh_Assignment75();
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('e');
		charList.add('p');
		charList.add('t');
		charList.add('q');
		charList.add('a');
		charList.add('c');
		charList.add('t');
		charList.add('t');
		charList.add('u');
		assignment75.occurance(charList, 't');
		System.out.println("output:--"+charList);
	}
}
