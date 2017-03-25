package factory;

public class Truck extends FourWheeler {
	private Truck(){
		setName("Tacoma");
		setMake("Toyota");
		setYear(2006);
	}
	
	public static final Truck create(){
		return new Truck();
	}

}
