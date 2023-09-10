package narendra;

class Assignment10_GetMonthSeasonInformation {

	void printMonthInfo(int monthIndex) {
		System.out.println("\n");
		if (monthIndex >= 1 && monthIndex <= 12) {
			if (monthIndex >= 1 && monthIndex <= 3) {
				System.out.println("Quarter -> Q1");
				if (monthIndex == 1) {
					System.out.println("Month -> January");
					System.out.println("Season -> Winter");
				} else if (monthIndex == 2) {
					System.out.println("Month -> February");
					System.out.println("Season -> Winter");
				} else if (monthIndex == 3) {
					System.out.println("Month -> March");
					System.out.println("Season -> Summer");
				}
			} else if (monthIndex >= 4 && monthIndex <= 6) {
				System.out.println("Quarter -> Q2");
				if (monthIndex == 4) {
					System.out.println("Month -> April");
					System.out.println("Season -> Summer");
				} else if (monthIndex == 5) {
					System.out.println("Month -> May");
					System.out.println("Season -> Summer");
				} else if (monthIndex == 6) {
					System.out.println("Month -> June");
					System.out.println("Season -> Monsoon");
				}
			} else if (monthIndex >= 7 && monthIndex <= 9) {
				System.out.println("Quarter -> Q3");
				if (monthIndex == 7) {
					System.out.println("Month -> July");
					System.out.println("Season -> Monsoon");
				} else if (monthIndex == 8) {
					System.out.println("Month -> August");
					System.out.println("Season -> Monsoon");
				} else if (monthIndex == 9) {
					System.out.println("Month -> September");
					System.out.println("Season -> Autumn");
				}
			} else if (monthIndex >= 10 && monthIndex <= 12) {
				System.out.println("Quarter -> Q4");
				if (monthIndex == 10) {
					System.out.println("Month -> October");
					System.out.println("Season -> Autumn");
				} else if (monthIndex == 11) {
					System.out.println("Month -> November");
					System.out.println("Season -> Autumn");
				} else if (monthIndex == 12) {
					System.out.println("Month -> December");
					System.out.println("Season -> Winter");
				}
			}
		} else {
			System.out.println("Invalid Month");
		}
	}

	public static void main(String[] args) {
		Assignment10_GetMonthSeasonInformation getmonthseasoninfo = new Assignment10_GetMonthSeasonInformation();
		getmonthseasoninfo.printMonthInfo(1);
		getmonthseasoninfo.printMonthInfo(12);
		getmonthseasoninfo.printMonthInfo(5);
		getmonthseasoninfo.printMonthInfo(9);
	}
}
