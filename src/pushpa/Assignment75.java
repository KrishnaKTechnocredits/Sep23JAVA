//Assignment-75 : 2nd Nov'2023
//
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

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment75 {

	public ArrayList<Character> replaceDuplicateChar(ArrayList<Character> arrayList, char input) {
		System.out.println(arrayList);
			if(arrayList.indexOf(input) != arrayList.lastIndexOf(input)) {
				arrayList.set(arrayList.indexOf(input), 'a');
				arrayList.set(arrayList.lastIndexOf(input), 'b');
			}
		return arrayList;
	}

	public static void main(String[] args) {
		Assignment75 assignment75 = new Assignment75();
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
		ArrayList<Character> primeNumbersList = assignment75.replaceDuplicateChar(charList, 't');
		System.out.println(primeNumbersList);
	}
}
