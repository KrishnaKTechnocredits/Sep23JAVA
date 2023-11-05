package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example11 {

	List<String> processData(){
		ArrayList<String> al = new ArrayList<String>();
		return al;
	}

	void m1(){
		List<String> temp = (LinkedList<String>)processData();
		System.out.println(temp.size());
	}
	
	public static void main(String[] args) {
		Example11 example11 = new Example11();
		example11.m1();
	}

}
