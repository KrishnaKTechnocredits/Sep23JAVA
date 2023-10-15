package sakshi;
//Assignment-33 : 26th Sep'2023
//Print sum of all the even numbers from given array.
//input : {10,11,44,33,23}
//output : 54

public class Assignment33{
	
	void getEvenSum(int[] arr){
		int sum = 0;
		int evenVal=0;
		for(int index=0; index<arr.length; index++){
			evenVal = arr[index];
			if(evenVal % 2 == 0){
			sum = sum + evenVal;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Assignment33 assignment33 = new Assignment33();
		int[] num = {10,11,44,33,23};
		assignment33.getEvenSum(num);
	}
}