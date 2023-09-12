package hetal;

public class Reverse {
	void printStringInReverse(String input) {
		for(int index=input.length()-1;index>=0;index--) {
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		reverse.printStringInReverse("techno");
	}

}
