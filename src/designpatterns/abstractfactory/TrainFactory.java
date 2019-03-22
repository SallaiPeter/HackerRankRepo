package designpatterns.abstractfactory;

public class TrainFactory extends VehicleFactory {

	@Override
	public Vehicle getVehicle(String vehicleType) {
			if(vehicleType.equalsIgnoreCase("FreightTrain"))
				return new FreightTrain();
			if(vehicleType.equalsIgnoreCase("ExpressTrain"))
				return new ExpressTrain();
			
			return null;
		}
}
