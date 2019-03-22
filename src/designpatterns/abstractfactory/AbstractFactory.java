package designpatterns.abstractfactory;

public class AbstractFactory {

	public static void main(String[] args) {
		
		VehicleFactory carFact = FactoryProducer.getFactory("car");
		Vehicle vehicle1 = carFact.getVehicle("Sedan");
		vehicle1.ride();
		
		Vehicle vehicle2 = FactoryProducer.getFactory("train").getVehicle("ExpressTrain");
		vehicle2.ride();
	}

}
