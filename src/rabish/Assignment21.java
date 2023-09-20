package rabish;

public class Assignment21 {

	int frequencyCount(String str, char ch) {
		int count=0;
		for (int index=0;index<str.length();index++)
			if(str.charAt(index)==ch)
		{
			count++;
		}
		return count;
	}
	
	void maxCharFreq(String str) {
		
		int maxFreq=0;
		char maxChar=' ';
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			int freq=frequencyCount(str,ch);
			if(maxFreq<freq) {
				maxFreq=freq;
				maxChar=ch;
			}
			
		}
		System.out.println("Maximum Frequency "+maxChar+"="+maxFreq);
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment21 a = new Assignment21();
		a.maxCharFreq("Rabishssss");

	}

}
