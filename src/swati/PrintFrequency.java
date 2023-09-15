/*Assignment-20 : 12th Sep'2023 Write a program to print frequency of each character from given String. input : 
aakanksha output : a->4 a->4 k->2 a->4 n->1 k->2 s->1 h->1 a->4*/

package swati;

public class PrintFrequency {
	
	void printCharFrequency(String input) {
		for(int index=0;index<input.length();index++) {
			int count = 0;
			char ch = input.charAt(index);
			for(int innerindex=0;innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
				count++;
				}
			}System.out.println(ch+" -> "+count);
		}
	}

	public static void main(String[] args) {
		PrintFrequency printFrequency = new PrintFrequency();
		String value = "aakanksha";
		printFrequency.printCharFrequency(value);
	}
}
