/*
Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y
 
*/

package narendra;

public class Assignment35_GetNamePrintedArray {
	void toPrintNameAndFirstchar(String[] strArray) {
		System.out.println("output is: ");
		for (int index = 0; index < strArray.length; index++) {
			System.out.println(strArray[index] + " -> " + strArray[index].charAt(0));
		}
	}

	public static void main(String[] args) {
		String[] inputArray = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35_GetNamePrintedArray getnameandfirstchar = new Assignment35_GetNamePrintedArray();
		getnameandfirstchar.toPrintNameAndFirstchar(inputArray);

	}

}
