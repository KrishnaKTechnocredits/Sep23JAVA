//Assignment 14
package pushpa;

class Assignment14 {

    int noDivisibeBy;

    public void findNoDivisibleBy5And9(int num1, int num2) {
        for (int i = num2; i >= num1; i--) {
            if (i % 5 == 0 && i % 9 == 0) {
                noDivisibeBy = i;
                break;
            }
        }
        System.out.println("Last number divisible by 5 & 9 is " + noDivisibeBy);
    }

    public static void main(String args[]) {
        Assignment14 assignment14 = new Assignment14();
        assignment14.findNoDivisibleBy5And9(5, 100);
    }
}