package technoCredits.array;

public class Example2 {

	void updateArr(String[] input) {
		input[0] = "Maulik";
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			System.out.println(name + ":" + name.length());
		}
	}

	public static void main(String[] args) {
		String[] names = { "Sayli", "Deepak", "Nivedita", "Yogesh" };
		Example2 example2 = new Example2();
		example2.updateArr(names);
		names[4] = "Mohit";
	}
}
