/*Write a program to print frequency of each character from given String.
input : aakanksha
output : 
a->4
a->4
k->2
a->4
n->1
k->2
s->1
h->1
a->4*/

package sakshi;

public class Assignment20 {

	void getFrequency(String inputName) {
		for(int index=0; index<inputName.length(); index++) {
			char ch = inputName.charAt(index);
			int count=0;
			for (int innerIndex=0; innerIndex<inputName.length(); innerIndex++) {
				if(inputName.charAt(innerIndex) == ch){
					count++;
				}
			}
			System.out.println(ch +" -> " + count);
		}
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		String nameValue ="aakanksha";
		assignment20.getFrequency(nameValue);
	}
}
