/*Assingment - 25 : 18th Sep'2023
Print the freq of all character using nested for loop.
String str = "aakanksha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1

*/		
package roshani;

public class Assignment25{
	
	void printFreqOfAllChar(String str){
		for(int index = 0; index < str.length(); index++){
			int count = 0;
			char ch = str.charAt(index);
			if(ch != '*'){
				for(int innerIndex = 0; innerIndex < str.length(); innerIndex++){
					if (ch == str.charAt(innerIndex)){
						count++;
						System.out.println(ch +"-->"+ count);
						str = str.replace(ch, '*');
					}
				}
			}
		}
	}	
	public static void main(String[] args){
		Assignment25 assignment25 = new Assignment25();
		assignment25.printFreqOfAllChar("aakanksha");
	}
}