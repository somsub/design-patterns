package factory;

public class SportsCar extends FourWheeler {

	private SportsCar() {
		setMake("Chevy");
		setName("Sports Car");
		setYear(2005);
	}
	
	public final static SportsCar create(){
		return new SportsCar();
	}

}
