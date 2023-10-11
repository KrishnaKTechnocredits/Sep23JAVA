/*Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/


package hetal;

public class Assignment49 {
	
	void printDiff(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		int diff=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				max=arr[index];
			}
			else if(arr[index]<min){
				min=arr[index];
			}
		}
		diff = max - min;
		System.out.println("difference beetween age of yongest and eldest family member " +diff);
	}
	
	public static void main(String[] args) {
		int[] age = {13,45,2,48,89,91};
		new Assignment49().printDiff(age);
	}

}
