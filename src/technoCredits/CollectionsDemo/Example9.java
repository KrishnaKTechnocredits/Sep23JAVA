package technoCredits.CollectionsDemo;

import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
		String[] arr = {"Jay", "Sayali", "Denish", "Roshni", null, null};
		arr = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(arr));
	}
}
