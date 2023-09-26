package denish;

public class Assignment35 {

	void printName(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + "->" + arr[index].charAt(0));
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35 assignment35 = new Assignment35();
		assignment35.printName(arr);
	}
}
