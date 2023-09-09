package pushpa;

class CheckMonths {

    String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November",  "December" };

    public void printMonthInfo(int month) {
        if (month >= 1 && month <= 3) {
            System.out.println("Q1");
            if (month == 1 || month == 2)
                System.out.println("Winter");
            else
                System.out.println("Spring");
            System.out.println(months[month - 1]);
        } else if (month >= 4 && month <= 6) {
            System.out.println("Q2");
            if (month == 4 || month == 5)
                System.out.println("Spring");
            else
                System.out.println("Summer");
            System.out.println(months[month - 1]);
        } else if (month >= 7 && month <= 9) {
            System.out.println("Q3");
            if (month == 7 || month == 8)
                System.out.println("Summer");
            else
                System.out.println("Autumn");
            System.out.println(months[month - 1]);
        } else if (month >= 10 && month <= 12) {
            System.out.println("Q4");
            if (month == 10 || month == 11)
                System.out.println("Autumn");
            else
                System.out.println("Winter");
            System.out.println(months[month - 1]); 
        } else {
            System.out.println("Invalid month");
        }
    }

    public static void main(String[] args) {
        CheckMonths checkMonths = new CheckMonths();
        checkMonths.printMonthInfo(1);
        checkMonths.printMonthInfo(2);
        checkMonths.printMonthInfo(12);
        checkMonths.printMonthInfo(6);
        checkMonths.printMonthInfo(9);
    }
}