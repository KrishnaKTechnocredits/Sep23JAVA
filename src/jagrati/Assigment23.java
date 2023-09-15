package jagrati;

public class Assigment23 {
	
	void getCountChar(String str) {
			int uCount =0; 
			int lCount =0;
			int dCount =0;
			int sCount =0;
			for(int index=0; index < str.length(); index++) {
				if (Character.isUpperCase(str.charAt(index))) {
					uCount++;
				}else if (Character.isLowerCase(str.charAt(index))) {
					lCount++;
				}else if (Character.isDigit(str.charAt(index))) {
					dCount++;
				}else 
					sCount++;
			}System.out.println("UpperCase in TecHNo_cR6ediTs-> " + uCount + " UpperCase in TecHNo_cR6ediTs-> "
					+ lCount + " Digit in TecHNo_cR6ediTs-> "+ dCount+ " Special Character in TecHNo_cR6ediTs-> " + sCount );
			
		}
		
		public static void main(String[] args) {
			Assigment23 chara = new Assigment23();
			chara.getCountChar("TecHNo_cR6ediTs");   
		}
}
