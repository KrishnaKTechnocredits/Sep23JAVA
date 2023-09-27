/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y*/

package jaykumar;

public class Assignment35 {

	void printName(String[] input) {
		for(int index=0; index<input.length; index++) {
			String str = input[index];
			char ch = str.charAt(0);
			System.out.println(str+" -> "+ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment35.printName(input);
	}
}
