
public class VehicleService {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.displayInfo();
		c.showDetails();
	}
}

class Vehicle
{
	String brand = "Honda";
	int speed = 120;
	
	public void displayInfo()
	{
		System.out.println("Brand : "+ brand);
		System.out.println("Speed : "+ speed);
	}
}

class Car extends Vehicle
{
	int seatingCapacity = 5;
	
	public void showDetails()
	{
		System.out.println("SeatingCapacity : " + seatingCapacity);
	}
}


