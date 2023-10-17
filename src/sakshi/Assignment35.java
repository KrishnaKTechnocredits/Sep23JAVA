//Assignment-35
//Print name and its first letter from given array.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
//output : Sayli -> S
//         deepak -> d
//         Nivedita -> N
//		 Yogesh -> Y

package sakshi;

public class Assignment35{
	
	void printNameInitials(String[] names){
		for(int index=0; index<names.length; index++){
			String name = names[index];
			char ch = name.charAt(0);
			System.out.println(names[index] + "->" + ch);
		}
	}
	
	public static void main(String[] args){
		Assignment35 assignment35 = new Assignment35();
		String[] names = {"Sayli", "deepak", "Nivedita", "Yogesh"};
		assignment35.printNameInitials(names);
	}
}