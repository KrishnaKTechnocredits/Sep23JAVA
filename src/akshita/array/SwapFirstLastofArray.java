//WAP to swap first and last element of array.Pint it to confirm swap operation.
//input={"Sayali","deepak","Nivedita","Yogesh"}
//Output = {"Yogesh","deepak","Nivedita","Sayali"}


package akshita.array;

import java.util.Arrays;

public class SwapFirstLastofArray {

	void getUpdatedArray(String[] input) {
		String var =input[0];
		input[0]= input[input.length-1];
		input[input.length-1]= var;
		System.out.println("Output : " + Arrays.toString(input));
	}
	
	public static void main(String[] args) {
		SwapFirstLastofArray swapFirstLastofArray = new SwapFirstLastofArray();
		System.out.println("Swap first and last element of array");
		String[] arr = {"Sayali","deepak","Nivedita","Yogesh"};
		System.out.println("Input : " + Arrays.toString(arr));
		swapFirstLastofArray.getUpdatedArray(arr);
	}

}
