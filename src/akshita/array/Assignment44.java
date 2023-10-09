//Convert input element into uppercase if it contain digit.
//input ={"Rah2u4" , "Technocredits" , "J6a6y", "cred5it2s"}
//output : {"RAH2U4L","Technocredits",J6A6Y" , "CRED5IT2S" }

package akshita.array;

public class Assignment44 {
	void stringUpperCase(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String output = input[index];
			for (int innerIndex = 0; innerIndex <= input.length; innerIndex++) {
				char ch = output.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					output = output.toUpperCase();
				}
			}
			System.out.print(output + " ");
		}
	}

	public static void main(String[] args) {
		Assignment44 ass44 = new Assignment44();
		String[] arr = { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" };
		System.out.println("Convert input element into uppercase if it contain digit");
		System.out.print("[");
		ass44.stringUpperCase(arr);
		System.out.println("]");
	}
}
