package aditya;
class Example16{
	
	void processData(int startRange, int endrange){
		for(int num=endrange; num>=startRange; num--){
			if(num%5==0){
				System.out.println(+num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Example16 example16 = new Example16();
		example16.processData(1,98);
	}
}


