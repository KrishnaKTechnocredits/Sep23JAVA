
//Apply for loop to get the characters of the blogName in the reverse order i.e int i = blogName.length()-1; i <= 0; i- -;
package pavan;

public class RevarseOrder {
	
	void Reverse(String name) {
		//System.out.println(name.length());
		for(int index=name.length()-1;index>=0;index--) {
			System.out.println(name.charAt(index));
			
			
			//System.out.println(name);
		}
		//System.out.println(name);
	}

	public static void main (String[] args) {
		//System.out.println("Hi");

		RevarseOrder assi19 = new RevarseOrder();
		 assi19.Reverse("Techno");
	}
}	
