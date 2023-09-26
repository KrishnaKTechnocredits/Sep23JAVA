/*Assignment-35 :  26th Sep'2023 Print name and its first letter from given array. 
input: { "Sayli", "deepak", "Nivedita", "Yogesh" } 
output : 
Sayli -> S      
deepak -> d     
Nivedita -> N 
Yogesh -> Y */

package swati;

public class Ass35PrintNameAndFirstLetter {

	void printNameAndFirstLetter(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			System.out.println(name + ":" + name.charAt(0));
		}
	}

	public static void main(String[] args) {
		Ass35PrintNameAndFirstLetter ass35PrintNameAndFirstLetter = new Ass35PrintNameAndFirstLetter();
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		ass35PrintNameAndFirstLetter.printNameAndFirstLetter(arr);
	}
}
