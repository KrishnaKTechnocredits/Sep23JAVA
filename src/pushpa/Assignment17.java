//Assignment 17
class Assignment17 {

    public void printNumbers(int start, int end) {
        int count = 0;
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                count++;
                if (count <= 4) {
                    if (count == 1)
                        continue;
                    System.out.println(i);
                    if (count == 4)
                        break;
                }
            }
        }
    }

    public static void main(String args[]) {
        Assignment17 assignment17 = new Assignment17();
        assignment17.printNumbers(10, 100);
    }
}