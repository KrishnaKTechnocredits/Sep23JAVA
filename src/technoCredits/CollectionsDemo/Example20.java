package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example20 {

	public static void main(String[] args) {
		String[] arr = {"Hetal","Rahul","Sayali","Rahul"};
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(arr));
		
		for(String name : listOfName) {
			System.out.println(listOfName.indexOf(name) + "--" + name);
		}
		
		String str = "technocredits";
		String[] strArr = str.split("");
		for(String ch : strArr) {
			char currentCh = ch.charAt(0); //'t'
			Character.isDigit(currentCh);
		}
		
		
	}
}
