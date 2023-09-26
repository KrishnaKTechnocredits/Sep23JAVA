package naresh;

public class Assignment32 {

	void m1(String input) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int asciivalue = ch;

			if (asciivalue >= 65 && asciivalue <= 90) {
				uCount++;

			} else if (asciivalue >= 97 && asciivalue <= 122) {
				lCount++;
			} else if (asciivalue >= 48 && asciivalue <= 57) {
				dCount++;
			}
		}
		System.out.println("uppercase->" + uCount);
		System.out.println("lowercase->" + lCount);
		System.out.println("digits->" + dCount);
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.m1("TeCHNoc33r44editS");
	}

}
