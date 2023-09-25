package technoCredits.oops.encapsulation;

public class Car {
	private double speed = 100;
	
	void setSpeed(double carSpeed) {
		if(carSpeed > 0 && carSpeed<=1000)
			speed = carSpeed;
	}
	
	void display() {
		System.out.println("Car top speed is " + speed);
	}
}
