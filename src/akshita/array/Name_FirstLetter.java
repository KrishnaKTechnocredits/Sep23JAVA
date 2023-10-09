//WAP to print name and first letter from given array. Input={"Sayali","deepak","Nivedita","Yogesh"}
//Output: Sayali->s


package akshita.array;

import java.util.Arrays;

public class Name_FirstLetter {

	void nameFLetter(String[] input) {
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index] + "->" +input[index].charAt(0));
		} 
	}
	
	public static void main(String[] args) {
		Name_FirstLetter name_FirstLetter = new Name_FirstLetter();
		String[] arr = {"Sayali","deepak","Nivedita","Yogesh"};
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println(" ");
		System.out.println("Output : ");
		name_FirstLetter.nameFLetter(arr);
	}

}
