/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y*/

package mohit;

public class Assignment_35 {
	
	void nameWithFirstLetterOfArray(String[] input){
		for(int index=0; index<input.length;index++) {
			
			System.out.println(input[index]+ "->" + input[index].charAt(0) );
		}
	}

	public static void main(String[] args) {
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment_35 assignment_35 = new Assignment_35();
		assignment_35.nameWithFirstLetterOfArray(input);
		}
}
