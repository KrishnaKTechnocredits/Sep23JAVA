//Assignment 16
package pushpa;

class Assignment16 {

    int count = 0;

    public void printNosDivisibleBy3And4(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                count++;
                if (count == 3)
                    break;
            }
        }
    }

    public static void main(String args[]) {
        Assignment16 assignment16 = new Assignment16();
        assignment16.printNosDivisibleBy3And4(10, 500);
    }
}