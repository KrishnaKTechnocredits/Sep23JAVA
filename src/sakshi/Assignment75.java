//If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.
//input : t
//output : [e,p,a,q,a,c,t,b,u]

package sakshi;
import java.util.ArrayList;


public class Assignment75{
	
	void replaceChar(ArrayList<Character> charList, char ch){
		if(charList.contains(ch)){
			if(charList.indexOf(ch) != charList.lastIndexOf(ch)){
				charList.set(charList.indexOf(ch),'a');
				charList.set(charList.lastIndexOf(ch),'b');
			}
			System.out.println("output" + charList);
		}
	}

	public static void main(String[] args){
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
		
		System.out.println("input -" + charList);
		char ch ='t';
		new Assignment75().replaceChar(charList,ch);
	}
}