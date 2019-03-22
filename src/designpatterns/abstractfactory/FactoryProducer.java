package designpatterns.abstractfactory;

public class FactoryProducer {

	public static VehicleFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("Train"))
			return new TrainFactory();
		if(factoryType.equalsIgnoreCase("Car"))
			return new CarFactory();
		return null;
	}
}
