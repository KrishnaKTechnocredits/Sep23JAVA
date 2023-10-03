/*
Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 
*/

package narendra;

import java.util.Arrays;

public class Assignment36_ToSwapFirstAndLastElementFromStringArray {
	void toSwapElementFromStringArray(String[] strArray) {
		String tempStr = strArray[0];
		strArray[0] = strArray[strArray.length - 1];
		strArray[strArray.length - 1] = tempStr;
		String output = Arrays.toString(strArray);
		System.out.println("output is: " + output);

		/*
		  System.out.println(Arrays.toString(strArray));
		  
		  for( int index = 0; index < strArray.length; index++) {
		  System.out.println(strArray[index]); }
		
		*/
	}

	public static void main(String[] args) {
		String[] inputStrArr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment36_ToSwapFirstAndLastElementFromStringArray swapstrarr = new Assignment36_ToSwapFirstAndLastElementFromStringArray();
		swapstrarr.toSwapElementFromStringArray(inputStrArr);

	}

}
