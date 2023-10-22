/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y */

package shrutika;

public class As35ArryFirstLetterOfArry {

	void printArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			System.out.println(name + " -> " + name.charAt(0));
		}
	}

	public static void main(String[] args) {
		String[] arryInput = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		As35ArryFirstLetterOfArry arryFirstLetterOfArryA35 = new As35ArryFirstLetterOfArry();
		arryFirstLetterOfArryA35.printArray(arryInput);
	}
}
