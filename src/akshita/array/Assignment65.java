//WAP to check alphanumeric string palindrome a8r9t7t9r8a , 1j1, c9e3rtr3e9c,12521, jadeja

package akshita.array;

public class Assignment65 {

	boolean palindrome1(String input1) {
		String input=input1;
		String reverse="";
		int length = input.length();
		for(int index=length-1;index>=0;index--) {
			reverse = reverse + input.charAt(index);
		}
		if(input.equals(reverse)) {
			return true;
		}
		else 
			return false;
	}
	
	
	void palindrome(String[] input) {
		for(int index=0;index<input.length;index++) {
			boolean input1 = palindrome1(input[index]);
			boolean flag = input1;
			if(flag) {
				System.out.println(input[index] + " : is a palindrome");
			}
			else
				System.out.println(input[index] + "	 : is not a palindrome");
		}
	}
	


	public static void main(String[] args) {
		Assignment65 assi65 = new Assignment65();
		String[] str = {"a8r9t7t9r8a" , "1j1", "c9e3rtr3e9c", "12521", "jadeja" };
		assi65.palindrome(str);
	}

}
