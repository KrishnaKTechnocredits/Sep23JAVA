//Assignment 13
package pushpa;

class Assignment13 {

    public void findNosDivisibleBy7Or13(int num1, int num2) {
        int divisibleBy;
        for (int i = num2; i >= num1; i--) {
            if (i % 7 == 0 || i % 13 == 0) {
                divisibleBy = i % 7 == 0 ? 7 : 13;
                System.out.println(i + " is divisible by " + divisibleBy);
            }
        }
    }

    public static void main(String args[]) {
        Assignment13 assignment13 = new Assignment13();
        assignment13.findNosDivisibleBy7Or13(5, 40);
    }
}