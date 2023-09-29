/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54
*/
package jyoti;
public class Assignment33{

	int printSumOfEvenNumbers(int[] arr){
		int sum=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index] %2 ==0){
			sum= sum + arr[index];
			}
		}
			return sum;
	}
	public static void main(String[] args){
	int[] input= {10,11,44,33,23};
	Assignment33 as= new Assignment33();
	int result=as.printSumOfEvenNumbers(input);
	System.out.println(result);	
	}

}
