/*Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y
*/
package roshani;

public class Assignment35{
	
	void printName(String[] input){
		
		for(int index = 0; index < input.length; index++){
			System.out.println(input[index] + "-->" + input[index].charAt(0));
		}
	}
	
	public static void main(String[] args){
		
		String[] names = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35 assignment35 = new Assignment35();
		assignment35.printName(names);
	}
	
}		 
		 
		 