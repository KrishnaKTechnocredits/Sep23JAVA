package technoCredits.CollectionsDemo;

import java.util.*;

//int -> Integer [autoboxing] [1.5]
//Integer -> int [unboxing] [1.5]

public class Example28 {
	Double d1 = null;
	Character ch = null;
	Boolean b = null;
	Long l = null;
	Byte b1;
	Short s1;
	
	public static void main(String[] args) {
		Map<String, Integer> builderMap = new HashMap<String, Integer>();
		builderMap.put("Kalpataru",36);
		System.out.println(builderMap.put("VJ",45));
		builderMap.put("Rohan",42);
		builderMap.put("Kp",42);
	
		System.out.println(builderMap);
		
		int temp = builderMap.put("Rohan",92);
		System.out.println(temp); // 42
		temp = builderMap.get("Rohan");
		System.out.println(temp); //92
		
		boolean flag = builderMap.containsKey("KAlpataru");
		System.out.println(flag);
		
		System.out.println(builderMap.size());
		
		builderMap.remove("Kp");
		System.out.println(builderMap);
		
		builderMap.containsValue(36);
}
}