/*Assignment - 47 : 8th Oct'2023
Print the name having maximum digit sum from given array.
Eliminate digits from string

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]	 
*/
package roshani;

public class Ass47StringWithoutDigits{

	String getOutput(String str){
		String output = "";
	
		for(int index=0;index<str.length();index++){
			char ch = str.charAt(index);
			if(!Character.isDigit(ch)){
				output = output + ch;
			}
		}
		return output;
	}
	
	void eliminateDigit(String[] arr){
		for(int index = 0; index < arr.length; index++){
			String output = getOutput(arr[index]);
		System.out.print(output + " , ");
		}
	}
	
	public static void main(String[] args){
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new Ass47StringWithoutDigits().eliminateDigit(input);
	}
}