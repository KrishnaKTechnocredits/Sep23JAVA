//Assignment 19
package pushpa;

public class StringReverse {

	public void printStringInReverseOrder(String str) {
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		StringReverse  stringReverse = new StringReverse();
		stringReverse.printStringInReverseOrder("Pushpa");
	}

}
