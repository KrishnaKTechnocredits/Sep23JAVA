package rahul;

class Assignment10_Month {
	
	void month(int num) {
		if (num == 0 || num > 12 || num <= 0) {
			System.out.println("Invalid Index");
		}
		else if (num == 1) {
			System.out.println("Quarter -> Q1");
			System.out.println("Season -> Winter");
			System.out.println("Month Name -> January");
		}
		else if (num == 2) {
			System.out.println("Quarter -> Q1");
			System.out.println("Season -> Summer");
			System.out.println("Month Name -> Feburary");
		}
		else if (num == 3) {
			System.out.println("Quarter -> Q1");
			System.out.println("Season -> Summer");
			System.out.println("Month Name -> March");
		}
		else if (num == 4) {
			System.out.println("Quarter -> Q2");
			System.out.println("Season -> Summer");
			System.out.println("Month Name -> April");
		}
		else if (num == 5) {
			System.out.println("Quarter -> Q2");
			System.out.println("Season -> Summer");
			System.out.println("Month Name -> May");
		}
		else if (num == 6) {
			System.out.println("Quarter -> Q2");
			System.out.println("Season -> Rainy");
			System.out.println("Month Name -> June");
		}
		else if (num == 7) {
			System.out.println("Quarter -> Q3");
			System.out.println("Season -> Rainy");
			System.out.println("Month Name -> July");
		}
		else if (num == 8) {
			System.out.println("Quarter -> Q3");
			System.out.println("Season -> Rainy");
			System.out.println("Month Name -> August");
		}
		else if (num == 9) {
			System.out.println("Quarter -> Q3");
			System.out.println("Season -> Spring");
			System.out.println("Month Name -> September");
		}
		else if (num == 10) {
			System.out.println("Quarter -> Q4");
			System.out.println("Season -> Spring");
			System.out.println("Month Name -> October");
		}
		else if (num == 11) {
			System.out.println("Quarter -> Q4");
			System.out.println("Season -> Winter");
			System.out.println("Month Name -> November");
		}
		else if (num == 12) {
			System.out.println("Quarter -> Q4");
			System.out.println("Season -> Winter");
			System.out.println("Month Name -> December");
		}
	}
	
	public static void main (String args[]) {
		Assignment10_Month assignment10_month = new Assignment10_Month();
		assignment10_month.month(4);
		assignment10_month.month(12);
		assignment10_month.month(13);
		assignment10_month.month(0);
		assignment10_month.month(-4);
	}
}