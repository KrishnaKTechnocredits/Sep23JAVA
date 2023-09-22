package denish;

public class Assignment27 {
	
	void test(String str) {
		while(str.length() > 0){
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if(orgLength - newLength > 1) {
			System.out.println(ch + " -> " + (orgLength-newLength));
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.test("abcdcededffff");
	}
}
