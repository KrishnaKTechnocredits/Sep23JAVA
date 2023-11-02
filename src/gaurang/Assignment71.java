/*Write a method to return unique list of names from given ArrayList.*/

package gaurang;

import java.util.ArrayList;

public class Assignment71 {

	ArrayList<String> getUniqName(ArrayList<String> input){
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("Given input : ");
		System.out.println(input);
		for(int index = 0 ; index < input.size() ; index++) {
			String x = input.get(index);
			if(input.indexOf(x)==input.lastIndexOf(x)) {
				output.add(x);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment71 a = new Assignment71();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Gaurang");
		al.add("Jay");
		al.add("Kuldeep");
		al.add("Gaurang");
		al.add("Hetal");
		al.add("Gaurang");
		al.add("Vikram");
		ArrayList<String> output = a.getUniqName(al);
		System.out.println("Unique name in given input : ");
		System.out.println(output);
	}
}
