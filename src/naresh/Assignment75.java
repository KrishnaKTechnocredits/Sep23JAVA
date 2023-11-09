package naresh;

import java.util.ArrayList;

public class Assignment75 {
	void replaceFirst(ArrayList<Character> charList) {
		for (int index = 0; index < charList.size(); index++) {
			char ch = charList.get(index);
			if (charList.indexOf(ch) != charList.lastIndexOf(ch)) {
				int firstIndex = charList.indexOf(ch);
				int lastIndex = charList.lastIndexOf(ch);
				charList.set(firstIndex, 'a');
				charList.set(lastIndex, 'b');
			}
		}
		System.out.println(charList);
	}
public static void main(String[] args) {
		Assignment75 a = new Assignment75();
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
		a.replaceFirst(charList);
	}

}
/*
 * Assignment-75 : 2nd Nov'2023
 * 
 * If given character having multiple occurances then replace first occurances
 * with character 'a' and last occurances of the same character with 'b'.
 * 
 * ArrayList<Character> charList = new ArrayList<Character>();
 * charList.add('e'); charList.add('p'); charList.add('t'); charList.add('q');
 * charList.add('a'); charList.add('c'); charList.add('t'); charList.add('t');
 * charList.add('u');
 * 
 * input : t output : [e,p,a,q,a,c,t,b,u]
 */