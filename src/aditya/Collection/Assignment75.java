//If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.


package aditya.Collection;

import java.util.ArrayList;

public class Assignment75 {

	void GetUniqueList(ArrayList<Character> Clist, char ch) {
		if (Clist.contains(ch)) {
			if (Clist.indexOf(ch) != Clist.lastIndexOf(ch)) {
				Clist.set(Clist.indexOf(ch), 'a');
				Clist.set(Clist.lastIndexOf(ch), 'b');
			}
		}
		System.out.println("Updated" + Clist);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> CharacterList = new ArrayList<Character>();
		CharacterList.add('e');
		CharacterList.add('p');
		CharacterList.add('t');
		CharacterList.add('q');
		CharacterList.add('a');
		CharacterList.add('c');
		CharacterList.add('t');
		CharacterList.add('t');
		CharacterList.add('u');
		System.out.println("Original" + CharacterList);
		char ch = 't';
		new Assignment75().GetUniqueList(CharacterList, ch);

	}

}
