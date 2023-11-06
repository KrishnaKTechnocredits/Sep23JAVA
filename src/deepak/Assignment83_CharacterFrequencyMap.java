/*Assignment-83 : 5th Nov'2023
Return freq of each character in a given String.

input : technocredits
output : {t,2},{e,2},........
*/

package deepak;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment83_CharacterFrequencyMap {
	Map<Character, Integer> getCharFrequencyMap(String input) {
		System.out.println("Input : " + input);
		Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (output.containsKey(ch)) {
				output.put(ch, output.get(ch) + 1);
			} else
				output.put(ch, 1);
		}
		return output;
	}

	void printCharFrequency(Map<Character, Integer> output) {
		System.out.print("Output : ");
		Set<Character> keySet = output.keySet();
		for (Character ch : keySet) {
			System.out.print("{" + ch + "," + output.get(ch) + "}");
		}
	}

	public static void main(String[] args) {
		Assignment83_CharacterFrequencyMap output = new Assignment83_CharacterFrequencyMap();
		Map<Character, Integer> map = output.getCharFrequencyMap("technocredits");
		output.printCharFrequency(map);

	}
}
