package vishal;
/*Assingment - 26 : 18th Sep'2023
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1  */
public class Assignment26 {

	void printFreq(String str)
	{
		while(str.length()!=0)
		{
			int orgLen=str.length();
			char ch= str.charAt(0);
			str=str.replace(String.valueOf(ch),"");
			int newLen=str.length();
			System.out.println(ch+"-->"+(orgLen-newLen));
		}
	}
	public static void main(String[] args){
		Assignment26 assignment26= new Assignment26();
		assignment26.printFreq("aakanksha");
	}
}


