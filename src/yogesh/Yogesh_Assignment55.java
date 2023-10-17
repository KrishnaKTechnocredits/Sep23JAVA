//Assignment-55 : 13th Oct'2023
//String[] str = {"technocredits","aakanksha","yogesh","shamli"};
//output : technocredits -> eoei
//         aakanksha -> aaaa
//		 yogesh -> oe
//		 shamli -> ai
//
//void printVowels(String str){
//	
//}
//
//void processData(){
//	printVowels(arr[0]);
//}
//
//output : technocredits -> eoei
package yogesh;

public class Yogesh_Assignment55 {

	String printVowels(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}

	void processData(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String output = printVowels(arr[index]);
			System.out.println(arr[index] + "-->" + output);
		}
	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		Yogesh_Assignment55 assignment55 = new Yogesh_Assignment55();
		assignment55.processData(str);
	}
}
