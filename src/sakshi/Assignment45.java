//Assignment - 45 : 8th Oct'2023
//Print the name having maximum and minimum length from given array.
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Technocredits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : Min length name is : J6a6y
//         Max length name is : Technocredits
//-------------------------------------------------------------------------

package sakshi;

public class Assignment45{
	
	int getStringLength(String str){
		int strlength = str.length();
		return strlength;
	}
	
	void getStringFromArray(String[] arr){
		int minLength = arr[0].length();
		int maxLength = arr[0].length();
		String maxLengthName = "";
		String minLengthName = "";
		for(int index=0; index<arr.length; index++){
			int length = getStringLength(arr[index]);
			if(length>maxLength) {
				maxLength = length;
				maxLengthName = arr[index];
			}
			if(length<minLength) {
				minLength = length;
				minLengthName = arr[index];
			}
		}
		
		System.out.println("minimum length string is " + minLengthName);
		System.out.println("maximum length string is " + maxLengthName);
	}
	
	
	public static void main(String[] args){
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";	
		new Assignment45().getStringFromArray(input);
	}
}		