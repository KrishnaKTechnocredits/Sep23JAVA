package technoCredits.interview;

public class SecondMax {
	
	
	void findMax(int[] arr) {
		int max = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max < arr[index]) {
				max = arr[index];
			}
		}
		System.out.println(max);
	}
	
	void findSecondMax(int[] arr) {
		int max = arr[0];
		int secondMax = arr[1];
		
		if(arr[0]<arr[1]) {
			max = arr[1];
			secondMax = arr[0];
		}
		
		for(int index=2;index<arr.length;index++) {
			if(max < arr[index]) {
				secondMax = max; //55
				max = arr[index]; // 78
			}else if(secondMax < arr[index]) {
				secondMax = arr[index];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
	
	public static void main(String[] args) {
		int[] num = {12,2,55,6,33,78,67,44};
		new SecondMax().findSecondMax(num);
	}
}
