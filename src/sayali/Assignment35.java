/* Print name and its first letter from given array. 
input: { "Sayli", "deepak", "Nivedita", "Yogesh" } 
output : 
Sayli -> S      
deepak -> d     
Nivedita -> N 
Yogesh -> Y */

package sayali;

public class Assignment35 {

	void printNameAndFirstLetter(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			System.out.println(name + "-> " + name.charAt(0));
		}
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment35.printNameAndFirstLetter(arr);
	}
}