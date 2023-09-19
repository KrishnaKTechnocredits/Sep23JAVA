//Print the frequency of first repetative charachter using while loop :Input-"abcdededffff"

package akshita;

public class FirstNonRepetative {

	void firstNRep(String input) {
		while(input.length()>0) {
			int actualLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newLength = input.length();
			int diff = actualLength-newLength;
				if(diff >1) {
					System.out.println(ch + "->" + diff);
					break;
				}
		}
	}
	public static void main(String[] args) {
		FirstNonRepetative firstNonRepetative = new FirstNonRepetative();
		String var  = "abcdcededffff";
		System.out.println("The frequency of first repetative charachter");
		System.out.println("Input : " +var);
		firstNonRepetative.firstNRep(var);
	}
}


