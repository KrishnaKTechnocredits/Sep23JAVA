//Assignment 8
package pushpa;

class CheckDay {

    String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    public void printDayInfo(int index) {
        if (index >= 1 && index <= 5) {
            System.out.println("Weekday");
            System.out.println("Its a " + days[index - 1]);
        } else if (index == 6 || index == 7) {
            System.out.println("Weekend");
            System.out.println("Its a " + days[index - 1]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        CheckDay checkDay = new CheckDay();
        checkDay.printDayInfo(2);
        checkDay.printDayInfo(6);
        checkDay.printDayInfo(11);
        checkDay.printDayInfo(-3);
    }
}