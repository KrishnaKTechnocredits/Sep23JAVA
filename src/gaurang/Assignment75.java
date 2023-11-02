/*If given character having multiple occurances then
replace first occurances with character 'a' and last occurances of the same character with 'b'.*/

package gaurang;

import java.util.ArrayList;

public class Assignment75 {

	void getReplace(ArrayList<Character> input,char ch) {
		System.out.println("Given input : "+ input);
		if(input.indexOf(ch)!=input.lastIndexOf(ch)) {
			input.set(input.indexOf(ch),'a');
			input.set(input.lastIndexOf(ch), 'b');
		}else {
			System.out.println("Given character has not multiple occurance.");
		}
		System.out.println("Required output : " +input);
	}
	
	public static void main(String[] args) {
		Assignment75 a = new Assignment75();
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('e');
		al.add('p');
		al.add('t');
		al.add('q');
		al.add('a');
		al.add('c');
		al.add('t');
		al.add('t');
		al.add('u');
		a.getReplace(al,'t');
	}
}
