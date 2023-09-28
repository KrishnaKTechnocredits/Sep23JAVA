/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y*/

package rahul;

public class Assignment35_1 {

	void printNameAndFirstLetter(String input[]) {
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			char ch = str.charAt(0);
			System.out.println(input[index] + " -> " + ch);
		}
	}

	public static void main(String args[]) {
		Assignment35_1 assignment35_1 = new Assignment35_1();
		String array[] = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment35_1.printNameAndFirstLetter(array);
	}
}
