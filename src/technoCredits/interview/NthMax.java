package technoCredits.interview;

import java.util.Arrays;

public class NthMax {
	int x = 100;
	
	NthMax(){
		System.out.println("Hello");
	}
	
	NthMax(int x){
		System.out.println("Hi");
	}
	
	void findNthMax(int[] arr, int nth) { // 3
		//int[] orgArr = Arrays.copyOf(arr, arr.length);
		/*
		 * int[] orgArr = new int[2]; int tempIndex = 0; for(int
		 * index=0;index<arr.length;index++) { if(index>=arr.length-2) {
		 * orgArr[tempIndex] = arr[index]; tempIndex++; } }
		 */
		System.out.println(this);
		int[] orgArr = Arrays.copyOfRange(arr, arr.length-2, arr.length);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-nth]);
		System.out.println("==============");
		System.out.println(Arrays.toString(orgArr));
	}
	
	public static void main(String[] args) {
		int[] num = {12,2,55,6,33,78,67,44};
		new NthMax().findNthMax(num, 4);
	}
}
