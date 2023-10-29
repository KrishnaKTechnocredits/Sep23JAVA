package technoCredits.interview;

public class StringEx4 {
	
	public static void main(String[] args) {
		String str1 = "techno";
		String str2 = "TECHNO";
		
		String str3 = str1.toUpperCase();
		
		if(str2.equals(str3)) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
	}
}
