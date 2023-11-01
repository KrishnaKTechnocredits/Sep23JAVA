/*first 5 armstrong number from range 900 to 1100
*/
package onkar;

public class Assignment64 {
	
	boolean isArmStrong (int num) {
		int length = Integer.toString(num).length();
		int temp = num;
		int sum = 0;
		while(num != 0) {
			int digit = num%10;
			sum += Math.pow(digit, length);
			num /= 10;
		}
		if (temp == sum)
			return true;
		return false;
	}
	
	void findArmStrongNumInRange(int start, int end, int firstNNumbers) {
		System.out.println("Below are the first "+firstNNumbers+" armstrong numbers in given range "+start+"-"+end+" :");
		int count = 0;
		for (int index=start; index<=end; index++) {
			boolean flag = isArmStrong(index);
			if(flag) {
				System.out.println(index);
				count++;
				if (count == firstNNumbers)
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Assignment64().findArmStrongNumInRange(10,11000,5);
	}
}
