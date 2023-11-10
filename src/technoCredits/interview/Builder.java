package technoCredits.interview;

public class Builder implements Comparable<Builder>{
	
	String name;
	String city;
	int revenue;
	int yearsOfExp;
	
	public Builder(String name, String city, int revenue, int yearsOfExp) {
		super();
		this.name = name;
		this.city = city;
		this.revenue = revenue;
		this.yearsOfExp = yearsOfExp;
	}
	
	@Override
	public String toString() {
		return name + "->" + city + "->" + revenue + "->" + yearsOfExp;
	}


	@Override
	public int compareTo(Builder builder) {
		return  this.revenue - builder.revenue;
	}
}
