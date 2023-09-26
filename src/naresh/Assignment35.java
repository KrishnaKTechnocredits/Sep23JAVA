package naresh;

public class Assignment35 {

	void display(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			System.out.println(name + "->" + name.charAt(0));

		}

	}

	public static void main(String[] args) {
		String[] str = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment35 a = new Assignment35();
		a.display(str);

	}

}
/*
 * Assignment-35 : 26th Sep'2023 Print name and its first letter from given
 * array. input : { "Sayli", "deepak", "Nivedita", "Yogesh" } output : Sayli ->
 * S deepak -> d Nivedita -> N Yogesh -> Y
 */