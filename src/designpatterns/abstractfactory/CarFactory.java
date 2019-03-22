package designpatterns.abstractfactory;

public class CarFactory extends VehicleFactory{

	@Override
	public Vehicle getVehicle(String vehicleType) {
		if(vehicleType.equalsIgnoreCase("SportCar"))
			return new SportCar();
		if(vehicleType.equalsIgnoreCase("Sedan"))
			return new Sedan();
		
		return null;
	}

}
