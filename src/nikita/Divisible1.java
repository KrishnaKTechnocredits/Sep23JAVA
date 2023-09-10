package nikita;

public class Divisible1 {
	
int count;

	void div(int startindex, int endindex) {
		for(int i=startindex; i<=endindex;i++) {
			if(i%3==0 && i%4==0) {
				count++;
				System.out.println("The first 3 numbers divisible by 3 and 4 are :"+i);
				if(count==3){
					break;
				}
				
			}
				
		}
	}
	public static void main(String[] args) {
		Divisible1 divisible1= new Divisible1();
		divisible1.div(10,500);
	}
}
