/*Write a method to return list of names having frequency more than 1 from given ArrayList*/

package gaurang;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> getName(ArrayList<String> input){
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("Given input : "+ input);
		for(int index=0 ; index<input.size() ; index++) {
			String x = input.get(index);
			if(input.indexOf(x)!=input.lastIndexOf(x)) {
				if(!output.contains(x)) {
					output.add(x);
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment72 a = new Assignment72();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Gaurang");
		al.add("Jay");
		al.add("Hetal");
		al.add("Jay");
		al.add("Gaurang");
		al.add("Raj");
		al.add("Vikram");
		al.add("Gaurang");
		ArrayList<String> output = a.getName(al);
		System.out.println("Required output : " + output);
	}
}
