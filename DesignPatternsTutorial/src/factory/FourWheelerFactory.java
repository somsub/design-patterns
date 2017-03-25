package factory;

import java.util.Scanner;

public class FourWheelerFactory {
	public static FourWheeler create(String type){
		FourWheeler fourWheeler = null;
		switch(type){
			case "SportsCar": 
				fourWheeler = SportsCar.create();
				break;
			case "Truck": 
				fourWheeler = Truck.create();
				break;
			case "CompactCar":
				fourWheeler = CompactCar.create();
				break;
			default:
				fourWheeler = None4FourWheeler.create();
				break;	
		}
		return fourWheeler;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of 4 wheeler do you want to create? (S/T/C)");
		if(input.hasNextLine()){
			String userSelection = input.nextLine();
			System.out.println(FourWheelerFactory.create(userSelection));
					
		}
	}

}
