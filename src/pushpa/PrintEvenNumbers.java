//Assignment 11
package pushpa;

class PrintEvenNumbers {

    public void printEvenNos(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void main(String args[]) {
        PrintEvenNumbers printEvenNumbers = new PrintEvenNumbers();
        printEvenNumbers.printEvenNos(10, 15);
    }
}