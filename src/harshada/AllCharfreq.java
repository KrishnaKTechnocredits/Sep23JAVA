//Write a program to print frequency of each character from given String.
//input : aakanksha

package harshada;

public class AllCharfreq {
		 
	 void printCharFreq(String input) {
		 for(int userIndex=0; userIndex<input.length(); userIndex++) {
			 int count=0;
			 for(int index=0;index<input.length();index++) {
				 if(input.charAt(userIndex)== input.charAt(index)) {
					 count++;
				 }
			 } System.out.println(input.charAt(userIndex)+"->"+count);
		 }
	 }
	
	 public static void main(String[] args) {
		 AllCharfreq allCharfreq=new AllCharfreq();
		 String userInput="aakanksha";
		 allCharfreq.printCharFreq(userInput);
	}
}
