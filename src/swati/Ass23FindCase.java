package swati;

public class Ass23FindCase {
	int uppercasecount = 0;
	int lowercasecount =0 ;
	int digitcount = 0;
	int specialcount = 0;
	
	void findCharCase(String input) {
		for(int index=0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				uppercasecount++;
			}else if(Character.isLowerCase(input.charAt(index))) {
				lowercasecount++;
			}else if(Character.isDigit(input.charAt(index))) {
				digitcount++;
			}else {
				specialcount++;
			} 
		}
		System.out.println("uppercase-> "+uppercasecount+" Lowercase-> "+lowercasecount+ " Digit-> "+digitcount+ " Special char count-> "+specialcount);;
	}

	public static void main(String[] args) {
		Ass23FindCase ass23FindCase = new Ass23FindCase();
		ass23FindCase.findCharCase("TecHNo_cR6ediTs");
	}
}
