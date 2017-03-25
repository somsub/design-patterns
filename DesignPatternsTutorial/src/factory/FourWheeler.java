package factory;
//This is abstract so that no client can CREATE it 
public abstract class FourWheeler {
	private String name;
	private int year;
	private String make;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String toString(){
		return getYear() + " " + getName() +  " " + getMake();  
	}
	

}
