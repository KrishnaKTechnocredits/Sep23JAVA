//Assignment-35 :  26th Sep'2023
//Print name and its first letter from given array.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
//output : Sayli -> S
//         deepak -> d
//         Nivedita -> N
//		 Yogesh -> Y

package yogesh;

public class Yogesh_Assignment35 {

	void firstNameLetter(String[] input) {
		for (int index = 0; index < input.length; index++) {
		String name=input[index];
		System.out.println(name + "-->" + name.charAt(0));		}
		
	}

	public static void main(String[] args) {
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Yogesh_Assignment35 assignment35 = new Yogesh_Assignment35();
		assignment35.firstNameLetter(input);
	}
}
