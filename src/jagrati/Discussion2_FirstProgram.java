/*
 From given string, remove first and last instance of given char and change 
all other instance of same char case to uppercase.
String str = "JayKauamarapqw"
input : a
output : JyKAuAmArpqw
 */

package jagrati;

public class Discussion2_FirstProgram {
	
	void runTest(String input) {
		int firstIndex = input.indexOf('a') + 1;
		int lastIndex = input.lastIndexOf('a');
		String str1 = input.substring(firstIndex, lastIndex);
		// System.out.println(str1);
		String str2 = input.substring(0, firstIndex - 1);
		// System.out.println(str2);
		String str3 = input.substring(lastIndex + 1);
		// System.out.println(str3);
		String outputStr = str2 + str1 + str3;
		// System.out.println(outputStr);
		outputStr = outputStr.replace('a', 'A');
		System.out.println(outputStr);

	}

	public static void main(String[] args) {
		Discussion2 t = new Discussion2();
		t.runTest("JayKauamarapqw");
	}
}
