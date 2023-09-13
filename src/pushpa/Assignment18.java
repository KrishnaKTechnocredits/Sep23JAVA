//Assignment 18
class Assignment18 {

    public void prinSumAndAvg(int start, int end) {
        int sum = 0, count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("Found " + count + " numbers which are divible by 5 & 7.");
        System.out.println("Sum is :" + sum);
        System.out.println("Division is :" + (sum / count));
    }

    public static void main(String args[]) {
        Assignment18 assignment18 = new Assignment18();
        assignment18.prinSumAndAvg(1, 110);
    }
}