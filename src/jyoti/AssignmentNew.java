
package jyoti;
class AssignmentNew {
		void printLengthOfGivenString(String input) {
		for (int index=0 ; index<input.length();index++) {
			
		System.out.println(index + "->" + input.charAt(index));	
		}
	}
		
		void printLengthOfGivenStringInReverse(String input) {
			System.out.println("========================================");	
			for (int index =( input.length())-1 ; index>=0;index--) {
			
			System.out.println(index + "->" + input.charAt(index));	
			}
		}

		public static void main(String[] args) {
			AssignmentNew assgn= new AssignmentNew();
			assgn.printLengthOfGivenString("JyotiSaxena");
			assgn.printLengthOfGivenStringInReverse("JyotiSaxena");
		}
}