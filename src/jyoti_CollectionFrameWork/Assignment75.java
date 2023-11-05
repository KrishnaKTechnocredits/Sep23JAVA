/*
 Assignment-75 : 2nd Nov'2023

If given character having multiple occurances then replace first occurances with character 'a' and 
last occurances of the same character with 'b'.

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
package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment75 {

	ArrayList<Character> processCharList(ArrayList<Character> input, char ch) {
		if (input.contains(ch)) {
			int firstIndex = input.indexOf(ch);
			int lastIndex = input.lastIndexOf(ch);
			if (firstIndex != lastIndex) {
				input.set(firstIndex, 'a');
				input.set(lastIndex, 'b');
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArrayList<Character> charlist = new ArrayList<Character>();
		charlist.add('e');
		charlist.add('p');
		charlist.add('t');
		charlist.add('q');
		charlist.add('a');
		charlist.add('c');
		charlist.add('t');
		charlist.add('t');
		charlist.add('u');
		System.out.println("Original char list-->" + charlist);
		System.out.println("====================================");
		System.out.println("New processed arrayList is : " + new Assignment75().processCharList(charlist, 't'));
	}
}
