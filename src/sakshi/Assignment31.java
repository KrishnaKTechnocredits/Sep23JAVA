package sakshi;
//Assignment-31 : 23nd Sep'2023 
//Write a method which takes input and return all Uppercase from given input using ascii.
//input : "TeCHNocreditS";
//output : TCHNS

public class Assignment31{

	void printUpperCase(String input){
		String str ="";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch >= 65 && ch <=90){
				str = str+ch;
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args){
		Assignment31 assignment31 = new Assignment31();
		String str = "TeCHNocreditS";
		assignment31.printUpperCase(str);
	}
}