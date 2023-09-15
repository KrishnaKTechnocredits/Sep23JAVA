/*Assignment-20 : 12th Sep'2023

Write a program to print frequency of each character from given String.
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

package roshani;

public class Assignment20 {
	
	void charFreqInGivenString(String input) {
		
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if(input.charAt(innerIndex) == ch){
					count++;
				}
			}
			System.out.println("Frequency of char " + ch + " in " + input + " is : " + count);
		}
		
	}
	
	public static void main(String[] args) {
		
		Assignment20 assignment20 = new Assignment20();
		String input = "aakanksha";
		assignment20.charFreqInGivenString(input);
	}
}
