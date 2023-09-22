package vishal;

/*Assignment - 23 : 14th Sep'2023 Write a program to find count of Uppercase, lowercase, digits and special characters. String str = "TecHNo_cR6ediTs"; output : 
Uppercase -> 5  
Lowercase -> 8 
Digit -> 1 Special
char count -> 1*/

public class Assignment23 {
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int digitCount = 0;
	int specialCount = 0;

	void findCharCase(String str) 
	{
		for (int index = 0; index < str.length(); index++) 
		{
			if (Character.isUpperCase(str.charAt(index))) 
			{
				upperCaseCount++;
			} 
			else if (Character.isLowerCase(str.charAt(index))) 
			{
				lowerCaseCount++;
			} 
			else if (Character.isDigit(str.charAt(index))) 
			{
				digitCount++;
			} 
			else 
			{
				specialCount++;
			}
		}
		System.out.println("UPPERCASE-> " + upperCaseCount + "\nLowercase-> " + lowerCaseCount + "\nDigit-> "
				+ digitCount + "\nSpecial char count-> " + specialCount);
	}

	public static void main(String[] args) 
	{
		Assignment23 ass23FindCase = new Assignment23();
		ass23FindCase.findCharCase("TecHNo_cR6ediTs");
	}
}
