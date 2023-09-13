package pavan;

class Days{
	
	void processData(int Index){
		if(Index==1){
			System.out.println("Monday");
			}else{
				System.out.println("Weekday");
				}
			}
		
	public static void main (String[] args){
		Days days = new Days();
		days.processData(1);
	}
}