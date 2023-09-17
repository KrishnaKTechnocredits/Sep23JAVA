//WAP to find count of Upper case, Lower case,Digits and Special Character
//input: TecHNo_cR6ediTs
//Output: Upper case:5, Lower case-8, Digit-1, Special char-1

package akshita;

public class Chracter {

	public static void main(String[] args) {
        int Ucount=0;
        int Lcount=0;
        int Dcount=0;
        int Scount=0;
		String var = "TecHNo_cR6ediTs";
			for(int index=0;index<var.length();index++) {
				 if(Character.isUpperCase(var.charAt(index))) {
				    	Ucount++;
				    }
				    else if(Character.isLowerCase(var.charAt(index))) {
				    	Lcount++;				    	
				    }
				    else if(Character.isDigit(var.charAt(index))){
				    	Dcount++;	
				    }
				    else {
				    	Scount++;
				    }
			}
			System.out.println("Input : " + var);
			System.out.println(" ");
			System.out.println("Output:");
			System.out.println("Upper Case    =>" + Ucount);
			System.out.println("Lower Case    =>" + Lcount);
			System.out.println("Digit Count   =>"+ Dcount);
			System.out.println("Special Count =>" + Scount);
	}

}
