package vishal;
/*Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

public class Assignment24 {

	void printSum(String str) 
	{
		int sum = 0;
		for (int index=0; index<str.length(); index++) 
		{
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) 
			{
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of numbers in String :>>   "+ str +" is =>: "+sum);
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.printSum("Rah5ulTEC6Hnoc2redItS");
	}
}
