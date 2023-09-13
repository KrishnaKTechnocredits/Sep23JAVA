package rabish;

public class FreqChar {
	
	void charFrequencyCount(String input) {
		
		
		for(int i=0;i<input.length();i++)
		{  char ch=input.charAt(i);
			
		int count=0;
			for(int innerIndex=0;innerIndex<input.length();innerIndex++)
			{
				if(input.charAt(innerIndex)==ch) {
					count++;
				}
			}
			System.out.println(ch +"->"+count);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FreqChar ch = new FreqChar();
		ch.charFrequencyCount("Raabisshhh");
	}

}
