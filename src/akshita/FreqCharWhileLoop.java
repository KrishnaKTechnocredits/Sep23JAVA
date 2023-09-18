//WAP to print frequency of character using while loop

package akshita;

public class FreqCharWhileLoop {
	void freqChar(String input) {
		while(input.length()>0) {
			int origLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newLength = input.length();
			System.out.println(ch + "-->" + (origLength-newLength));
		}
		
	}
	  

	public static void main(String[] args) {
		FreqCharWhileLoop FreqCharWhileLoop = new FreqCharWhileLoop();
		String var = "aakanksha";
		FreqCharWhileLoop.freqChar(var);
	}

}
