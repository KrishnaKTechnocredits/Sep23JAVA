package sakshi;
//Assignment-32 : 23nd Sep'2023 
//Write a method to print number of Uppercase,lowercase and digits in the input using ascii.
//input : "TeCHNoc33r44editS";
//output : Uppercase -> 5
//         Lowercase -> 8
//		 Digit -> 4

public class Assignment32{
	
	void printCaseCount(String input){
		int uCount=0;
		int lCount=0;
		int dCount=0;
		
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch >= 65 && ch <=90){
				uCount++;
			}else if(ch >= 97 && ch <=122){
				lCount++;
			}else if(ch >= 48 && ch <=57){
				dCount++;
			}
		}
		System.out.println("Uppercase " + uCount);
		System.out.println("Lowercase " + lCount);
		System.out.println("Digit " + dCount);
	}
	
	public static void main(String[] args){
		Assignment32 assignment32 = new Assignment32();
		String str = "TeCHNoc33r44editS";
		assignment32.printCaseCount(str);
	}
}