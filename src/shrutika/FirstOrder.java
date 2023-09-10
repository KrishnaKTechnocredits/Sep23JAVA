package shrutika;
//Assignment - 16
class FirstOrder{
	
	void order(int startNum, int endNum){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int num=startNum; num<=endNum; num++){
			if(num%3==0 && num%4==0){
				System.out.println(num);
				count = count+1;
				if(count>=3){
					break;
				}
			}	
		}
	}
	
	public static void main(String[] args){
		FirstOrder firstOrder = new FirstOrder();
		firstOrder.order(10,500);
	}
}