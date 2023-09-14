package akash;

class First3Number{
	
	void findFirst3Number(int startIndex, int endIndex){
		System.out.println("First 3 numbers which are divisible by 3 & 4 are: ");
		int count=0;
		for(int num=startIndex;num<=endIndex;num++){
			if(num%3==0 && num%4==0){
				System.out.print(num+"\n");
				count++;
				if(count==3){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		First3Number first3number = new First3Number();
		first3number.findFirst3Number(10,500);
	}
}