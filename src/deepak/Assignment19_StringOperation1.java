/*Assignment-19 : 10th Sep'2023
1. Print the frequecy of given character from given String.
input : technocredits
        t
		
output : frequency of t in technocredits is 2.

2. Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t
*/	   
package deepak;
class Assignment19_StringOperation1{
	void charFrequecy(String input, char ch){
		System.out.println("String: "+input);
		int count = 0;
		for(int index = 0 ; index < input.length() ; index++){
			if(input.charAt(index) == ch){
				count++;
			}
		}System.out.println("Frequency of "+ch+" in "+input+" is "+count);
	}
	
	void reverseString(String input){
		System.out.println("String: "+input);
		for(int index = input.length()-1 ; index >=0 ; index--){
			System.out.println(input.charAt(index));
		}
	}
		
	public static void main(String[] args){
		Assignment19_StringOperation1 strOp = new Assignment19_StringOperation1();
		strOp.charFrequecy("technocredits", 't');
		System.out.println();
		strOp.reverseString("techno");
	}
		
}