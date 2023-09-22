/*Assingment - 26 : 18th Sep'2023 Print the freq of all character using while loop.
String str = "aakansha";
 output : 
 a -> 4   
 k -> 2 
 n -> 1
 s -> 1    
 h -> 1 2*/

package swati;

public class Ass26PrintFreqOfCharUsingWhileLoop {

	void printCharFreqency(String input) {
		while (input.length() > 0) {
			int originallength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int remaininglength = input.length();
			System.out.println(ch + " --> " + (originallength - remaininglength));
		}
	}

	public static void main(String[] args) {
		new Ass26PrintFreqOfCharUsingWhileLoop().printCharFreqency("aakanksha");
	}
}
