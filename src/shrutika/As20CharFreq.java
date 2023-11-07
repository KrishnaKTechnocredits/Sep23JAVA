//Assignment-20 : 12th Sep'2023

//Write a program to print frequency of each character from given String.
//input : aakanksha
//output : 
//a->4
//a->4
//k->2
//a->4
//n->1
//k->2
//s->1
//h->1
//a->4
package shrutika;

public class As20CharFreq {

	void charFreqInfo(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(ch + " ->" + count);
		}
	}

	public static void main(String[] args) {
		As20CharFreq charFreq = new As20CharFreq();
		charFreq.charFreqInfo("aakanksha");
	}

}
