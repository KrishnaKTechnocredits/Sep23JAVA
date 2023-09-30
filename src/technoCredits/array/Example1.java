package technoCredits.array;

public class Example1 {

	int getSumOfArray(int[] arr) {
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			sum = sum + arr[index];
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] input = {10,92,112,12,13,14,55,99};
		Example1 example1 = new Example1();
		int result = example1.getSumOfArray(input);
		System.out.println(result);
	}
}
