package naresh;

public class Assignment43 {
	int innerSum = 0;
	int outerSum2 = 0;

	void diff(String str, char ch) {

		int num1 = str.indexOf(ch);
		int num2 = str.lastIndexOf(ch);
		String str1 = str.substring(num1, num2);

		String str2 = str.substring(0, num1) + str.substring(num2);

		for (int index = num1; index < str1.length(); index++) {// inner sum
			char ch1 = str.charAt(index);
			if (Character.isDigit(ch1)) {
				innerSum = innerSum + Character.getNumericValue(ch1);

			}
		}
		for (int index = 0; index < str2.length(); index++) {
			char ch2 = str2.charAt(index);
			if (Character.isDigit(ch2)) {
				outerSum2 = outerSum2 + Character.getNumericValue(ch2);

			}
		}
		System.out.println("innerSum"+str1+"-> "+innerSum);
		System.out.println("outerSum"+str2+"-> "+outerSum2);
		System.out.println("diff of outerSum and innerSum is ->"+(outerSum2 - innerSum));
		
	}

	public static void main(String[] args) {
		Assignment43 a = new Assignment43();
		a.diff("t1ec5ehno4e7credit983", 'e');
	}

}


