/*Assignment - 24 : 16th Sep'2023
Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

package mayank;

public class Assignment24 {
	void sumCharacters(String input){
	int sum =0;
		for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index))){
				int digit=Character.getNumericValue(input.charAt(index));
				sum=sum+digit;
		    } 
	    }    
			System.out.println(sum);
	}
		public static void main(String[] args){
			Assignment24 assignment24 = new Assignment24();
			assignment24.sumCharacters("Rah5ulTEC6Hnoc2redITS");
	}
}


