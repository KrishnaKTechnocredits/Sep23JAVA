/*Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);
*/
package jyoti;
class Assignment30{
	String output="";
	int count=0;
	
	void display(String str){
		for(int index=0; index<str.length();index++){
			if (Character.isUpperCase(str.charAt(index))){
				output= output+str.charAt(index);
				count++;
			}
				
		}
		System.out.println("output->"+output);
	}

public static void main(String[] args){
Assignment30 st = new Assignment30();
st.display("TeCHNocreditS");
}
}