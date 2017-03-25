package factory;

public class CompactCar extends FourWheeler {
	private CompactCar(){
		setName("Versa");
		setMake("Nissa");
		setYear(2010);
	}
	
	public static final CompactCar create(){
		return new CompactCar();
	}

}

