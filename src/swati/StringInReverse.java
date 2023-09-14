/*Assignment-19 : 10th Sep'2023
2. Print character of given String in reverse order. input : techno output : o   n   h   c   e   t*/

package swati;

public class StringInReverse {
	
	void stringInReverseOrder(String input) {
		for(int index=input.length()-1;index>=0;index--){
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringInReverse stringInReverse = new StringInReverse();
		stringInReverse.stringInReverseOrder("TECHNO");
	}
}
