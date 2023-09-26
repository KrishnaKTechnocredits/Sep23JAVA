package pramod;


/*

Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}

*/
public class ProgrammingTest1_AllDigitUpperLower {
	
	String islower,isUpper,isDigit;
	public String getOutput1(String input) {
		
		islower= "";
		isUpper= "";
		isDigit= "";
		
		String reArrenge= "";
		for(int i=0; i<input.length();i++)
		{
			char c =input.charAt(i);
			if(Character.isDigit(c))
			{
				isDigit = isDigit+c;
			}
			else if(Character.isUpperCase(c))
			{
				isUpper = isUpper+c;
			}
			else
			{
				islower = islower+c;
			}
		}
		reArrenge=isDigit+isUpper+islower;
		return reArrenge;
	}
	
	public String getOutput2(String input) {
		String reArrenge= "";
		islower= "";
		isUpper= "";
		isDigit= "";
		int sum =0;
		for(int i=0; i<input.length();i++)
		{
			char c =input.charAt(i);
			if(Character.isDigit(c))
			{
				sum = Character.getNumericValue(c);
				sum += c;
			}
			else if(Character.isUpperCase(c))
			{
				isUpper = isUpper+c;
			}
			else
			{
				islower = islower+c;
			}
		}
		reArrenge=sum+isUpper+islower;
		return reArrenge;
	}
	
	
	public static void main(String[] args)
	{
		ProgrammingTest1_AllDigitUpperLower pr = new ProgrammingTest1_AllDigitUpperLower();
		
		String input = "TeCHNoc33r44editS";
		String output1 =pr.getOutput1(input);
		String output2 =pr.getOutput2(input);
		
		System.out.println("Reagrrenge =" + output1);
		System.out.println("Reagrrenge+Sum digits=" + output2);
		
	}

}
