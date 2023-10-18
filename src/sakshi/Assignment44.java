//Assignment - 44 : 8th Oct'2023
//Convert the input element into upper case if it contains digit.
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Technocredits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]

package sakshi;
import java.util.Arrays;
public class Assignment44{
	
	String covertToUpperCase(String input){
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				input = input.toUpperCase();
			}
		}
		return input;
	}
	
	void getStringFromArray(String[] arr){
		for(int index=0; index<arr.length;index++){
			arr[index] = covertToUpperCase(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String args[]){
		Assignment44 assignment44 = new Assignment44();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment44.getStringFromArray(input);
	}
}
	