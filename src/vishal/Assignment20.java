package vishal;

public class Assignment20 {
	
	void charFrequencyFromGivenInput(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int count = 0;
			for(int innerIndex = 0; innerIndex<str.length();innerIndex++)
			{
				if(str.charAt(innerIndex) == ch)
				{
					count++;
				}
			}
			System.out.println(ch + "--->: " + count);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment20 assignment20 = new Assignment20();
		String str = "aakanksha";
		assignment20.charFrequencyFromGivenInput(str);
	}
}
