package aditya;
class assignment11{
	void Displayeven(int Startno, int Endno){
		for(int num=Startno; num<=Endno; num++){
			if(num%2 ==0){
				System.out.println("number is" +num);
			}
		}
	}
	
	public static void main(String[] args){
		assignment11 as11= new assignment11();
		as11.Displayeven(10,15);
	}
}