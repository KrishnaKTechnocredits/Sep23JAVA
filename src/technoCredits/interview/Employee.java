package technoCredits.interview;

import java.util.Arrays;

public class Employee {
	int empid = 123;
	String empname = "techno";

	@Override
	public String toString() {
		return empid + "->" + empname;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.toString()); //

		String str = new String("Maulik");
		System.out.println(str);

		int[] arr = { 10, 20 };
		System.out.println(Arrays.toString(arr));
	}
}
