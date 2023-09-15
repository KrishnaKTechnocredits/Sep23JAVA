
package naresh;

public class Frequency {

	void display(String name) {

		int count = 0;
		for (int index = 0; index < name.length(); index++) {

			if (name.charAt(index) == 't') {

				count = count + 1;
			}
		}
		System.out.println("frequency of t in technocredits is " + count);
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		frequency.display("technocredits");

	}

}
