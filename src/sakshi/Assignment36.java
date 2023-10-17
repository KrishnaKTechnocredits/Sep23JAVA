//Assignment-36
//Swap first and last element of an array, print it to confirm swap operation.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
//output : { "Yogesh", "deepak", "Nivedita","Sayli"}

package sakshi;
import java.util.Arrays;

public class Assignment36{

	void swapString(String[] names){
		System.out.println("Before " + Arrays.toString(names));
		String temp = names[0];
		names[0] = names[names.length-1];
		names[names.length-1] = temp;
		System.out.print("After " + Arrays.toString(names));
	}

	public static void main(String[] args){
		Assignment36 assignment36 = new Assignment36();
		String[] names = {"Sayli", "deepak", "Nivedita", "Yogesh"};
		assignment36.swapString(names);
	}
}