/*Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y*/

package onkar;

public class Assignment35 {
	
	void printFirstChar (String[] arr) {
		for (int index=0; index<arr.length; index++) {
			String name = arr[index];
			System.out.println(name+" -> "+name.charAt(0));
		}
	}
	
	public static void main (String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment35.printFirstChar(input);
	}
}
