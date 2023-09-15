//Write a program to print non repeatative character from given String.
//input : technocredits
//output : hnordis

package vishal;

public class Assignment22 {
	
	void findNonRepeatativeChar (String input)
	{
		for(int index=0; index<input.length(); index++) 
		{
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch))
//				System.out.println("Non Repetative Charaters in given String :" + input + "are --> " + ch);
			    System.out.print(ch);
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment22 assignment22 = new Assignment22();
		assignment22.findNonRepeatativeChar("technocredits");
	}
}
