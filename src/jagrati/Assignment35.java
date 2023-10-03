/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y
 */

package jagrati;

public class Assignment35 {
	void firstLetter(String[] input){
		System.out.println("Print name and its first letter from given array.");
		for(int index =0; index < input.length; index++) {
			String name = input[index];
			char ch = input[index].charAt(0);
			System.out.println(name + "->" + ch);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35 assign = new Assignment35();
		assign.firstLetter(input);

	}
}
