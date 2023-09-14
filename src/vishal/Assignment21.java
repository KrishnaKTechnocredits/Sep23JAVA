//Write a program to find character having maximum frequency from given String.
//input : aakanksha
//output : aakanksha -> a -> 4
//
//input : teecccchnoceredites
//output : teecccchnoceredites -> e -> 5

package vishal;

public class Assignment21 {

	int getCharacterFrequency(String name, char ch) 
	{
		int count=0;
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)==ch) 
			{
				count++;
			}
		}
		return count;
	}

	void getMaximumCharFrequency(String inputName) 
	{
		int maxFrequency = 0;
		char maxChar =' ';
		for(int index=0; index<inputName.length(); index++) 
		{
			char ch = inputName.charAt(index);
			int frequency= getCharacterFrequency(inputName, ch);
			if(maxFrequency<frequency) 
			{
				maxFrequency = frequency;
				maxChar = ch;
			}
		}
		System.out.println(inputName + "--> "+ maxChar +" --> " + maxFrequency);
	}

	public static void main(String[] args) 
	{
		Assignment21 assignment21 = new Assignment21();
		assignment21.getMaximumCharFrequency("aakanksha");
		assignment21.getMaximumCharFrequency("teecccchnoceredites");
	}
}