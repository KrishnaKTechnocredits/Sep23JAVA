/*

Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y
*/

package nivedita;

public class A35PrintArr {

	public void printLetter() {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " -> " + arr[i].charAt(0));
		}
	}

	public static void main(String[] args) {
		A35PrintArr printArr = new A35PrintArr();
		printArr.printLetter();
	}

}