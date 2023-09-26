/*
 * Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y
 */

package shamli.array;

public class Assignment35 {
	
	void printNameAndFirstLetterOfName(String[] arr) {
		String str="";
		for(int index=0;index<arr.length;index++) {
			str=arr[index];
			System.out.println(arr[index]+"->"+str.charAt(0));
		}
	}

	public static void main(String[] args) {
		Assignment35 assignment35=new Assignment35();
		String input[]=  { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment35.printNameAndFirstLetterOfName(input);
	}
}
