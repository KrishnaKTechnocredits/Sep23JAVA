/* Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : h */
package mayank;

public class Assignment29 {

		void lastNonRepeatitive(String input){
			while(input.length()>0){
				int orglength = input.length();
				char ch = input.charAt(input.length()-1);
				input = input.replace(String.valueOf(ch),"");
				int newlength = input.length();
					if (orglength-newlength==1){
						System.out.println(ch);
						break;
					}
				}
			}
			public static void main(String[] args){
				Assignment29 assignment29 = new Assignment29();
				assignment29.lastNonRepeatitive("technocreditss");
		}
		
	}


