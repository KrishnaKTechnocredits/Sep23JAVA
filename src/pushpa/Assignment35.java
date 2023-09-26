//Print name and its first letter from given array.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
//output : Sayli -> S
//         deepak -> d
//         Nivedita -> N
//		 Yogesh -> Y

package pushpa;

public class Assignment35 {

	public void printNameAndFirstLetter() {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " -> " + arr[i].charAt(0));
		}
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		assignment35.printNameAndFirstLetter();
	}

}
