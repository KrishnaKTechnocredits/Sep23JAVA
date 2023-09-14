package mayank;

public class AssignmentFrequency{
	void frequency(String input){
		int count=0;
		
		for(int i=input.length()-1;i>=0;i--){
		
			if(input.charAt(i) == 't'){
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is "+ count);	
	}
	
	public static void main(String[] args){
		AssignmentFrequency assignmentfrequency = new AssignmentFrequency();
		assignmentfrequency.frequency("technocredits");
	}
}
