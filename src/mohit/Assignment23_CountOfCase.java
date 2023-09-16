package mohit;

public class Assignment23_CountOfCase {

	void Test(String str) {

		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int specialCharCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				uCount++;

			} else if (Character.isLowerCase(str.charAt(index))) {
				lCount++;
			} else if (Character.isDigit(str.charAt(index))) {
				dCount++;
			} else {
				specialCharCount++;
			}

		}
		System.out.println("Uppercase-->" + uCount);
		System.out.println("Uppercase-->" + lCount);
		System.out.println("Uppercase-->" + dCount);
		System.out.println("Uppercase-->" + specialCharCount);

	}

	public static void main(String[] args) {

		Assignment23_CountOfCase assignment23_CountOfCase = new Assignment23_CountOfCase();
		String str = "TecHNo_cR6ediTs";
		assignment23_CountOfCase.Test(str);

	}

}
