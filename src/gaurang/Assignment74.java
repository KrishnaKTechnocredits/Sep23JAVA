/*return the list of all the prime numbers in a give list.*/

package gaurang;

import java.util.ArrayList;

public class Assignment74 {

	void getPrime(ArrayList<Integer> input) {
		System.out.println("Given input : "+input);
		for(int index=0 ; index<input.size() ; index++) {
			int x = input.get(index);
			if(x<=0) {
				System.out.println("Invalid number.");
			}else {
				boolean flag = true;
				for(int innerindex=2 ; innerindex <= x/2 ; innerindex++) {
					if(x%innerindex == 0) {
						flag = false;
						System.out.println(x+" is not prime.");
						break;
					}
				}
				if(flag) {
					System.out.println(x+" is prime.");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment74 a = new Assignment74();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(17);
		al.add(22);
		al.add(13);
		al.add(27);
		al.add(29);
		al.add(33);
		a.getPrime(al);
	}
}
