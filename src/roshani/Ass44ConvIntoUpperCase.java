/*Assignment - 44 : 8th Oct'2023

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]
*/

package roshani;

public class Ass44ConvIntoUpperCase{
	
	String convertIntoUpperCase(String str){
		String strUpper = "";
	
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				strUpper = str.toUpperCase();
			}else if(strUpper == ""){
				strUpper = str;
			}
		}
		return strUpper;
	}
	
	void processData(String[] arr){
		//int index=0;
		for(int index = 0; index < arr.length; index++){
			//System.out.println(arr[index]);
			String output = convertIntoUpperCase(arr[index]);
			System.out.print(output + " , ");	
		}
	}
	
	public static void main(String[] args){
		String[] input = new String[4]; //occupying m/m
		input[0] = "Rah2u4l"; //assigining value
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		//Ass44ConvIntoUpperCase ass44ConvertIntoUpperCase = new Ass44ConvIntoUpperCase();
		new Ass44ConvIntoUpperCase().processData(input); //instead of creating temp variable of new object, assigining directly it to a method as we want to use it only once.	
	}
}
