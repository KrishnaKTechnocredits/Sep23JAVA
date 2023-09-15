/*Assignment-21 : 13th Sep'2023

Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5*/


package nivedita;
class A21MaxFreq {
	
	int charFreq(String input, char ch){
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;		
	}
	
	void printMaxFreq(String input){
		int maxFreq = 0;
		char maxChar = 'a';
		for(int index=0;index<input.length();index++){
			char ch = input.charAt (index);
			int freq = charFreq(input, ch);
			if(maxFreq < freq){
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(maxChar + " : " + maxFreq);
		
	}
	
	public static void main(String[]args){
		A21MaxFreq a21MaxFreq =new A21MaxFreq();
		a21MaxFreq.printMaxFreq("aakanksha");
		a21MaxFreq.printMaxFreq("teecccchnoceredites");
	}
}