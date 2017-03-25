package factory;

import java.util.Scanner;

public class FourWheelerFactory {
	public static FourWheeler create(String type){
		FourWheeler fourWheeler = null;
		switch(type){
			case "SportsCar": 
				fourWheeler = new SportsCar();
				break;
			case "Truck": 
				fourWheeler = new Truck();
				break;
			case "CompactCar":
				fourWheeler = new CompactCar();
				break;
			default:
				fourWheeler = new None4FourWheeler();
				break;	
		}
		return fourWheeler;
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What kind of 4 wheeler do you want to create? (SportsCar/Truck/CompactCar)");
		if(userInput.hasNextLine()){
			String userSelection = userInput.nextLine();
			System.out.println(FourWheelerFactory.create(userSelection));
					
		}
	}

}
