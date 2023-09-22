/*Assingment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2*/

package mayank;

public class Assignment27 {

		void printCharFreq(String input){
			while(input.length()>0){
				int orglength = input.length();
				char ch = input.charAt(0);
				input = input.replace(String.valueOf(ch),"");
				int newlength = input.length();
				if (orglength-newlength>1){
				System.out.println(ch + "-->" + (orglength-newlength));
				break;
			}
			}
		}
		public static void main(String[] args){
			Assignment27 assignment27 = new Assignment27();
			assignment27.printCharFreq("abcdcededffff");
		}
		
	}

