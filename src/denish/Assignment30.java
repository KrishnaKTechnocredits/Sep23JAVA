package denish;

public class Assignment30 {
	
	public static void main(String[] args) {
		String str ="TeCHNocreditS";
		
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			
			if(Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}
	}
}
