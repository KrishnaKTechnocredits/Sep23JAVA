/*Assignment-75 : 2nd Nov'2023

If given character having multiple occurances then replace first occurances with character 'a' 
and last occurances of the same character with 'b'.

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

package roshani;

import java.util.ArrayList;

public class Ass75ReplaceCharArrayList {
	
	void replaceChar(ArrayList<Character> input, char ch) {
		System.out.println("Input list of characters are: " + input);
		
		if(input.indexOf(ch)!= input.lastIndexOf(ch)) {
			input.set(input.indexOf(ch),'a');
			input.set(input.lastIndexOf(ch),'b');
		}else {
			System.out.println("Mentioned char is not having multiple occurances.");
		}
		System.out.println("Output list of characters are: " + input);
	}
	public static void main(String[] args) {
		Ass75ReplaceCharArrayList assignment75 = new Ass75ReplaceCharArrayList();
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
		
		assignment75.replaceChar(charList, 't');
	}
	
}
