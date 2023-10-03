package akshay;

public class CharFreq {

	void M2(String name) {
		for (int index = 0; index < name.length(); index++) {
			int count = 0;
			char ch = name.charAt(index);
			for (int innerindex = 0; innerindex < name.length(); innerindex++) {
				if (name.charAt(innerindex) == ch)
					;
				count++;
			}
			System.out.println(name + "  " + ch + "  " + count);
		}
	}

	public static void main(String[] args) {
		CharFreq freq = new CharFreq();
		freq.M2("Akshayaaa");
	}

}