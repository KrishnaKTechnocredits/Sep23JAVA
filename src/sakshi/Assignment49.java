//Assignment - 49 : 8th Oct'2023
//Find the difference between age of yongest and eldest family member.
//int[] age = {13,45,2,48,89,91};
//output : (91-2) 89

package sakshi;

public class Assignment49{
	
	int findMaxMinDiff(int[] age){
		int maxAge = age[0];
		int minAge = age[0];
		for(int index=0; index<age.length; index++){
			if(age[index] > maxAge){
				maxAge = age[index];
			}
			if(age[index] < minAge){
				minAge = age[index];
			}
		}
		return (maxAge-minAge);
	}
	
	public static void main(String[] args){
		Assignment49 assignment49 = new Assignment49();
		int[] age = {13,45,2,48,89,91};
		int ageDiff = assignment49.findMaxMinDiff(age);
		System.out.println(ageDiff);
	}
}