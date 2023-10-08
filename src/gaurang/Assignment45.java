/*Print the name having maximum and minimum length from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits*/

package gaurang;

public class Assignment45 {
	
	void minMax(String[] input) {
		String output1 = input[0];
		String output2 = input[0];
		int maxCount = input[0].length();
		int minCount = input[0].length();
		int count = 0;
		for(int index = 0 ; index<input.length ; index++ ) {
			String x = input[index];
			count = x.length();
			if(count>=maxCount) {
				maxCount = count;
				output2 = x;
			}
			if(count<=minCount) {
				minCount = count;
				output1 = x;
			}
		}
		System.out.println("Min length name is : "+output1);
		System.out.println("Max length name is : "+output2);
	}
	
	public static void main(String[] args) {
		Assignment45 a = new Assignment45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		a.minMax(input);
	}
}
