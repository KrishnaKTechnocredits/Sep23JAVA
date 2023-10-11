/*Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : J6a6y -> 12*/

package jaykumar;

public class Assignment46 {

	void processArray(String[] arr) {
		int maxSum = 0;
		String maxSumName = "";
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
			}
			if(sum>maxSum) {
				maxSum = sum;
				maxSumName = arr[i];
			}
		}
		System.out.println("Name having max digit sum is: "+maxSumName+" ---> "+maxSum);
	}
	
	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment46.processArray(input);
	}
	
}
