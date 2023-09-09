package pushpa;

//Assignment 12
class Assignment12 {

    public void findNosDivisibleBy3And5(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Assignment12 assignment12 = new Assignment12();
        assignment12.findNosDivisibleBy3And5(5, 40);
    }
}