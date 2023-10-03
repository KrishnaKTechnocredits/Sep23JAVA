/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
 */
package jagrati;

public class Assignment34 {
	int getSum(int[] input){
		int evenNum =0;
		int oddNum =0;
		int sum =0;
		for(int index =0; index < input.length; index++){
			if(input[index]%2 == 0){
				evenNum = evenNum + input[index];
			} else 
				oddNum = oddNum + input[index];
		}if(evenNum>oddNum) {
			sum = evenNum - oddNum;
		}else 
			sum = oddNum - evenNum;
		return sum;
	}
  
	public static void main(String[] args) {
		int[] num ={10,3,44,33,35};
		int sum = new Assignment34().getSum(num);
		System.out.println(sum);
	}
}
