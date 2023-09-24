/*
 * Write a program to print frequency of each character from given String.
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
a->4
 */
package shamli;

public class Assignment20 {
	
	void freqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			int count=0;
			for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
				if(input.charAt(innerIndex)==ch) {
					count++;
				}
			}
			System.out.println("Frequency of "+ch+"-> "+count);
		}
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.freqOfEachChar("aakanksha");

	}

}
