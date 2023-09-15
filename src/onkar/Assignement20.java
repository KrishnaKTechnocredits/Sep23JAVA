/*Write a program to print frequency of each character from given String.
input : aakanksha
output : 
a->4
a->4
k->2
a->4
n->1
k->2
s->1
h->1
a->4*/

package onkar;

public class Assignement20 {

	void printCharactersFromString(String input) {
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int count=0;
			for (int innerIndex=0; innerIndex<input.length(); innerIndex++) {
				if (input.charAt(innerIndex)==ch)
					count++;
			}
			System.out.println(ch+"->"+count);
		}
	}
	
	public static void main(String[] args) {
		Assignement20 assignment20 = new Assignement20();
		assignment20.printCharactersFromString("aakanksha");
	}
}
