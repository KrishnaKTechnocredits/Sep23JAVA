//WAP to print only special characters from the given string.
//String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
//output : "_!# *&%$" 
//Note: including space in between
//In case you are really blocked, refer  #836 for my approach
package yogesh;

public class Yogesh_Assignment58 {

	void splChar(String str) {
		String output="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(!Character.isLetterOrDigit(ch)) {
				output+=ch;
			}
		}
		System.out.println("Special characters are:--"+output);
	}
	
	public static void main(String[] args) {
		Yogesh_Assignment58 assignment58=new Yogesh_Assignment58();
		assignment58.splChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
