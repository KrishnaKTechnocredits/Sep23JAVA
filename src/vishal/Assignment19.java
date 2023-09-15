package vishal;

public class Assignment19 {
	
	void reverseString(String s)
	{
		String rev = "";
		for(int i=s.length()-1; i>0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of given String is := " + rev);	
	}
	
	void occurnceOfCharaterInString1(String str,char ch)
	{
		int count = 0;
		for ( int i = 0; i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("Frequency of character :=>" + ch + " is " + count);
	}
	
	public static void main(String[] args) 
	{
		Assignment19 assignment19 = new Assignment19();
    	assignment19.reverseString("Techno");
    	System.out.println("=======================================");
		assignment19.occurnceOfCharaterInString1("TechnoCredits",'e');
	}
}
