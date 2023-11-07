/*If given character having multiple occurances then replace first */
 /* occurances with character 'a' and last occurances of the same character with 'b'*/
/*input : [e,p,t,q,a,c,t,t,u]*/
/*output : [e,p,a,q,a,c,t,b,u]*/



package hetal;
import java.util.ArrayList;

public class Assignment75 {
	
	ArrayList<Character>getChar(ArrayList<Character> input, char ch){
		if(input.indexOf(ch)!=input.lastIndexOf(ch)) {
			input.set(input.indexOf(ch), 'a');
			input.set(input.lastIndexOf(ch), 'b');		
		}
		return input;
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
		
		System.out.println("input : " +charList);
		ArrayList<Character> al = new Assignment75().getChar(charList,'t');
		System.out.println("output : " +al);
	}
}
