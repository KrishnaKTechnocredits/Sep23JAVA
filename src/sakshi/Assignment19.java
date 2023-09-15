/*1. Print the frequecy of given character from given String.
input : technocredits
        t
		
output : frequency of t in technocredits is 2.

2. Print character of given String in reverse order.
input : techno
output : 
o
n
h
e
t*/

package sakshi;

public class Assignment19 {

	void getFrequency(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index) == 'e') {
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is "+count);
	}

	void getReverseString(String name){
		for(int index=name.length()-1; index>=0; index--){
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.getFrequency("technocredits");
		assignment19.getReverseString("techno");
	}
	
}
