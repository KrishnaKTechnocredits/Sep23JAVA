/*Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y*/

package gaurang;

public class Assignment35 {

	char firstLetter(String input) {
		char output = input.charAt(0);
		return output;
	}
	
	void getLetter(String[] input) {
		char output = ' ';
		for(int index=0 ; index<input.length ; index++) {
			String x = input[index];
			output = firstLetter(x);
			System.out.println(x+" --> "+ output);
		}
	}
	
	public static void main(String[] args) {
		Assignment35 a = new Assignment35();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		a.getLetter(input);
	}
}
