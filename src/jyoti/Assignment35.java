/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y

*/
package jyoti;

public class Assignment35 {

	void printStartLetter(String[] arr) {

		for (int index = 0; index < arr.length; index++) {

			System.out.println(arr[index] + "--->" + arr[index].charAt(0));
		}
	}

	public static void main(String[] aregs) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35 as = new Assignment35();
		as.printStartLetter(arr);

	}

}