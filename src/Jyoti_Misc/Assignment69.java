package Jyoti_Misc;

import java.util.Scanner;

public class Assignment69 {

	int daysIndex(int index) {

		switch (index) {
		case 1:
			System.out.println("Weekday :" + index + " and Day is Monday");
			break;
		case 2:
			System.out.println("Weekday :" + index + " and Day is Tuesday");
			break;
		case 3:
			System.out.println("Weekday :" + index + " and Day is Wednesday");
			break;
		case 4:
			System.out.println("Weekday :" + index + " and Day is Thursday");
			break;
		case 5:
			System.out.println("Weekday :" + index + " and Day is Friday");
			break;
		default:
			System.out.println("Index is :" + index + " Invalid index");
		}
		return index;

	}

	public static void main(String[] args) {
		Assignment69 ass = new Assignment69();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please entrer the index");
			int index = sc.nextInt();
			System.out.println("You choose index as --->" + index);
			System.out.println("Output for this index is-->" + ass.daysIndex(index));
			System.out.println("Would you like to continue Yes/No");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}
		sc.close();

	}

}
