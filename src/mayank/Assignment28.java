package mayank;

public class Assignment28 {
	
		void firstNonRepeatitive(String input){
			while(input.length()>0){
				int orglength = input.length();
				char ch = input.charAt(0);
				input = input.replace(String.valueOf(ch),"");
				int newlength = input.length();
					if (orglength-newlength==1){
						System.out.println(ch);
						break;
					}
				}
			}
			public static void main(String[] args){
				Assignment28 assignment28 = new Assignment28();
				assignment28.firstNonRepeatitive("technocredits");
		}
		
	}

