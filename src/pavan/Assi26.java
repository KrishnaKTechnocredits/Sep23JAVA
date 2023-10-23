
/*Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1 	*/
  package pavan;
 

public class Assi26 {
	void printAll(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			System.out.println(ch + "->" + (orgLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assi26 assi26 = new Assi26();
		assi26.printAll("aakanksha");
	}
}
