/*Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h
*/

package mahesh;

public class Assignment28{

	void firstNonRepChar(String str){
		while(str.length()>1){
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch),"");
			int newLen = str.length();
			if(orgLen-newLen==1){
				System.out.println("First non-repeatative character in string is: '" +ch+"'");
				break;
			}
		}
	}

	public static void main(String[] args){
		Assignment28 assignment28 = new Assignment28();
		assignment28.firstNonRepChar("technocredits");

	}
}
