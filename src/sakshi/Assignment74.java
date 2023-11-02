//return the list of all the prime numbers in a give list.
package sakshi;
import java.util.ArrayList;

public class Assignment74{
	
	boolean isPrime(int num){
		boolean flag = true;
		for(int index=2;index<=num/2;index++){
		if(num%index==0){
			flag = false;
			break;
		}
	}
		return flag;
	}
	
	ArrayList<Integer> getUniqueNameList(ArrayList<Integer> number){
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int index=0; index<number.size(); index++){
			int num = number.get(index);
			boolean flag = isPrime(num);
			if(flag){
				primeList.add(num);
			}
		}
		return primeList;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(17);
		numbers.add(20);
		numbers.add(88);
		numbers.add(97);
		numbers.add(89);
		System.out.println("all number list -> " + numbers);
		System.out.println("Prime number list -> " +new Assignment74().getUniqueNameList(numbers));
	}
} 
