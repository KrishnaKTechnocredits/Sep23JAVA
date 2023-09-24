//Write a program to print sum of all the digits within given input.
//String str = "Rah5ulTEC6Hnoc2redItS";
//output : 13
//Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7

package harshada;

public class Sum0fDigits {
	
	void printSum(String input) {
		int sum=0;
		
		for(int index=0; index<input.length(); index++) {
			
			if(Character.isDigit(input.charAt(index))){
				char ch=input.charAt(index);
				int num=Character.getNumericValue(ch);
				sum=sum+num;
			}
		}
		System.out.println("Sum of digits from given String is= "+sum);
	}

	public static void main(String[] args) {
		Sum0fDigits sum0fDigits=new Sum0fDigits();
		sum0fDigits.printSum("Rah5ulTEC6Hnoc2redItS");
	}
}
