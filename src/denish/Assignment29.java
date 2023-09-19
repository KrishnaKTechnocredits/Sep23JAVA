package denish;

public class Assignment29 {
	
	void test2(String str) {
		while(str.length() > 0){
			int orgLength = str.length();
			char ch = str.charAt(str.length()-1);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if(orgLength - newLength == 1) {
			System.out.println(ch);
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.test2("technocredits");
	}
}
