
/*Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s
*/

package nivedita;
public class A29LastNonRep{

	void printDetails(String str){
		while(str.length()!=0) {
			int orgLen = str.length();
			char ch = str.charAt(orgLen-1);
			str = str.replace(String.valueOf(ch), "");
			int newLen = str.length();
			int count = orgLen-newLen;
			if(count==1) {
				System.out.println("The last non repeatative character is -->  "+ch);
				break;
			}
		}
	}
	public static void main(String[] args){
		A29LastNonRep lastNonRep = new A29LastNonRep();
		lastNonRep.printDetails("technocredits");
		}
}