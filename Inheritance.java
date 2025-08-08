class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel type: "+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: "+batteryCapacity);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar("Brand1","Model1","Diesal",80.9);
		ec.displayInfo();
	}
}
