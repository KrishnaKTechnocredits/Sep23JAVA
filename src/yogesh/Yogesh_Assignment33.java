//Assignment-33 : 26th Sep'2023
//Print sum of all the even numbers from given array.
//input : {10,11,44,33,23}
//output : 54

package yogesh;

public class Yogesh_Assignment33 {

	void sumOfEven(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if ( input[index]% 2 == 0) {
				sum = sum + input[index];
			}
		}
		System.out.println("Sum of Even numbers is "+sum);
	}
	
	public static void main(String[] args) {
		Yogesh_Assignment33 assignment33=new Yogesh_Assignment33();
		int[] input= {10,11,44,33,23};
		assignment33.sumOfEven(input);
	}

}
