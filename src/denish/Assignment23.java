package denish;

public class Assignment23 {
	
	public static void main(String[] args) {
		
		String str ="TecHNo_cR6ediTs";
		int ucount=0;
		int lcount=0;
		int dcount=0;
		int specialcount=0;
		
		for(int index=0; index<str.length(); index++) {
			
			if(Character.isUpperCase(str.charAt(index))) {
				ucount++;
			}else if(Character.isLowerCase(str.charAt(index))) {
				lcount++;
			}else if(Character.isDigit(str.charAt(index))) {
				dcount++;
			}else 
				specialcount++;
		}
		System.out.println("UpperCase"+ "->" + ucount);
		System.out.println("LowerCase"+ "->" + lcount);
		System.out.println("Digit"+"->"+dcount);
		System.out.println("Special char"+"->" + specialcount);
	}
}
