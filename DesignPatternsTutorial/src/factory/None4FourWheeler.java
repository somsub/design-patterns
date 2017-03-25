package factory;

public class None4FourWheeler extends FourWheeler {
	private None4FourWheeler(){
		
	}
	public static final FourWheeler create(){
		return new None4FourWheeler();
	}

}
