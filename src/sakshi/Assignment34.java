package sakshi;
//Assignment-34
//Return positive difference of sum of all the even numbers and odd numbers from given array.
//input : {10,3,44,33,35}
//output : 17
public class Assignment34{
	
	int getEvenOddDiff(int[] arr){
		int evenSum=0;
		int oddSum=0;
		
		for(int index=0; index<arr.length; index++){
			//val = arr[index];
			if(arr[index]%2==0){
				evenSum = evenSum + arr[index];
			}else{
				oddSum = oddSum + arr[index];
			}
			
		}
		if(evenSum>oddSum){
			 return (evenSum-oddSum);	
		}else{
			return (oddSum-evenSum);
		}
	}

	public static void main(String[] args){
		Assignment34 assignment34 = new Assignment34();
		int[] num = {10,3,44,33,35};
		int positiveDiff = assignment34.getEvenOddDiff(num);
		System.out.println("the positive difference of even odd value is " + positiveDiff);
	}
}