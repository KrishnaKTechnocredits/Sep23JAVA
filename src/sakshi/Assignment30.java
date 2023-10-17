package sakshi;
//Assignment-30 : 22nd Sep'2023 
//Write a method which takes input and return to return all Uppercase from given input.
//input : "TeCHNocreditS";
//output : TCHNS


public class Assignment30{
	
	void printUpperCase(String input){
		String str ="";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)){
				str=str+ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args){
		Assignment30 assignment30 = new Assignment30();
		String str = "TeCHNocreditS";
		assignment30.printUpperCase(str);
	}
}