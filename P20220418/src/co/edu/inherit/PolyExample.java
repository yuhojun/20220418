package co.edu.inherit;

class Driver {
	
	public void driver(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.driver(bus); // 매개변수의 다형성.
		driver.driver(taxi); // 매개변수의 다형성.
	}

}
