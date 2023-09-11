package hetal;

class Firstthreenum{
	
	void printfirstthreenum(int startIndex, int endIndex){
		int count = 0;
		for (int num = startIndex; num<= endIndex; num++){
			if(num % 3 == 0 && num % 4 ==0){
				count = count + 1;
				if(count<=3){
					System.out.println(num);
		    }
		}
	}
	}
	public static void main(String args[]){
        Firstthreenum firstthreenum = new Firstthreenum();
		System.out.println("first three numbers divisible by 3 and 4 are ");
        firstthreenum.printfirstthreenum(10,50);
	} 
}	