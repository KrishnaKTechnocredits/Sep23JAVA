package technoCredits.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassCastExample {
	
	static List<String> m1(){
		return new ArrayList<String>();
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = (ArrayList<String>)m1();
		System.out.println(list);
	}
	

}
