//If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.

package akshita.collection;

import java.util.ArrayList;

public class Assignment75 {
	
	void replace(ArrayList<Character> input , char ch) {
		if(input.lastIndexOf(ch) != input.indexOf(ch)) {
			input.set(input.indexOf(ch), 'a');
			input.set(input.lastIndexOf(ch), 'b');
		}
		System.out.println(input);
	}

	public static void main(String[] args) {
		Assignment75 ass75 = new Assignment75();
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
        ass75.replace(charList ,'t');
	}
}
