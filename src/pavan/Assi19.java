package pavan;

public class Assi19 {
	void pavan(String input ,  char ch) {
		int count=0;
		for (int index=0; index<input.length();index++) {
			
			 	if(input.charAt(index)== ch) {
					count++;
				}
		}
		System.out.println("index is "+ input.length());
		System.out.println("character " + ch + " frequency is =  " +count);{
			
			for(int index=input.length()-1;index>=0;index--) {
				System.out.println(input.charAt(index));
				
			}
		}
	}
		
		public static void main (String[] args) {
		Assi19 charfreq = new Assi19();
		charfreq.pavan("Techno",'a');
		}
}
   