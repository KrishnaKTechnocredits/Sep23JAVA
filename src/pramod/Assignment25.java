package pramod;
	public class Assignment25 {

			void print(String str){
					int l= str.length();
					for(int index=0; index<l; index++){
						int count=0;
						char ch= str.charAt(index);
						if (ch != '*'){
								for (int innerIndex=0; innerIndex < l; innerIndex++){
									char ch1= str.charAt(innerIndex);
									if (ch1==ch)
										count++;
								}
									str=str.replace(ch,'*');
									System.out.println(ch+" : ch-->" +count);
						}
					}
			}	
				
			public static void main(String[] args){
				Assignment25 nl= new Assignment25();
				nl.print("aaakanksha");
			}

	}


