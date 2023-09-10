package naresh;

class Practise1{

void value(int passStart ,int endIndex){
for(int num=passStart;num<=endIndex;num++){
	if(num%2==0){
		
		System.out.println(num);
		
	}
}
}
public static void main(String[] args){
	Practise1 practise = new Practise1();
	System.out.println("even numbers are");
	practise.value(10,15);
	
	
	
}
}









