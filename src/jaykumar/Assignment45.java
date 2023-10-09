/*Assignment - 45 : 8th Oct'2023
Print the name having maximum and minimum length from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : Min length name is : J6a6y
         Max length name is : Technocredits*/

package jaykumar;

public class Assignment45 {
	
	void processArray(String[] arr) {
		String maxLengthName = "";
		String minLengthName = "";
		int maxL = arr[0].length();
		int minL = arr[0].length();
		for(int i=1; i<arr.length; i++) {
			int length = arr[i].length();
			if(maxL<length) {
				maxL = arr[i].length();
				maxLengthName = arr[i];
			}else if(minL>length) {
				minL = arr[i].length();
				minLengthName = arr[i];
			}
		}
			
		System.out.println("Min length name is: "+minLengthName);
		System.out.println("Max length name is: "+maxLengthName);
	}

	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment45.processArray(input);
		
	}
}
