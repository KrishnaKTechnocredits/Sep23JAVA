package mayank;

public class MayankAssignment19{
 
	void printReverse(String input) {
		for(int i=input.length()-1;i>=0;i--) {
			System.out.println(input.charAt(i));
		}
	}
	public static void main(String[] args) {
		MayankAssignment19 mayankassignment19 = new MayankAssignment19();
		mayankassignment19.printReverse("techno");
	}
}
