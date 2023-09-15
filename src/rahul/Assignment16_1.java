/*Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36*/

package rahul;

public class Assignment16_1 {

	void div3And4(int startRange, int endRange, int howManyNos) {
		System.out.println("First 3 numbers divisible by 3 and 4 is: ");
		int count = 1;
		for (int index = startRange; index <= endRange; index++) {
			if (index % 3 == 0 && index % 4 == 0) {
				if (count <= howManyNos) {
					System.out.println(index);
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment16_1 assignment16_1 = new Assignment16_1();
		assignment16_1.div3And4(10, 500, 3);
	}
}
