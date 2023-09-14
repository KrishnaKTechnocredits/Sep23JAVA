package jagrati;

//Print information about the Month based on the Monday index. [Nested If else]

class MonthCount{

	void weatherSeason(int month){
		if (month >= 1 && month <= 4){
			System.out.println("Q1 ");
			if (month >1 || month <= 4){
			System.out.println("Season is winter");
			}if (month == 1){
			System.out.println("month is January");
			}if (month == 2){
			System.out.println("month is Febuary");
			}if (month == 3){
			System.out.println("month is March");
			}if (month == 4){
			System.out.println("month is April");
			}
		}else if (month >=5 && month <= 8){
			System.out.println("Q2 ");
			if (month > 5 ||  month < 8){
			System.out.println("Season is Summer");
			}if (month == 5){
			System.out.println("month is May");
			}if (month == 6){
			System.out.println("month is June");
			}if (month == 7){
			System.out.println("month is July");
			}if (month == 8){
			System.out.println("month is August");
			}
		}else if (month >=9 && month <= 12){
			System.out.println("Q3 ");
			if (month > 9 || month < 12){
			System.out.println("Season is Rainy");
			}if (month == 9){
			System.out.println("month is September");
			}if (month == 10){
			System.out.println("month is Octobar");
			}if (month == 11){
			System.out.println("month is November");
			}if (month == 12){
			System.out.println("month is December");
			}
		}
	}
	public static void main(String [] args){
		MonthCount count = new MonthCount();
		count.weatherSeason(1);
		count.weatherSeason(6);
		count.weatherSeason(9);
	}
}