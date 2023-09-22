package denish;

public class Assignment28 {
	
	void test1(String str) {
		while(str.length() > 0){
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if(orgLength - newLength == 1) {
			System.out.println(ch);
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.test1("technocredits");
	}
}
