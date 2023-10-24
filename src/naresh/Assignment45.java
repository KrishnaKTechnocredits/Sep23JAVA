package naresh;

public class Assignment45 {
	void m1(String[] arr) {
		int max = 0;
		int mini = 0;
		String name = "";
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			int length = str.length();
			if (length > max) {
				max = length;
				name = arr[i];
				if(max>length) {
				mini = length;
				name = arr[i];
					
				}
			}

		}

		System.out.println(name + "-->" + max);
		System.out.println(name + "-->" + mini);
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Assignment45 a = new Assignment45();
		a.m1(input);

	}

}


/*
 * Assignment - 45 : 8th Oct'2023
 * 
 * Print the name having maximum and minimum length from given array.
 * 
 * String[] input = new String[4]; input[0] = "Rah2u4l"; input[1] =
 * "Technocredits"; input[2] = "J6a6y"; input[3] = "cred5it2s";
 * 
 * output : Min length name is : J6a6y Max length name is : Technocredits
 */