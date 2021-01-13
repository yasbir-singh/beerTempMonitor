package tempMonitor;

import java.util.Scanner;
// this class is used to assign minimum and maximum values to our beers

public class beerType {
	Scanner sc= new Scanner(System.in);		
	float minTemp, maxTemp;
	
	beerType(){
		this.minTemp = 0;
		this.maxTemp = 0;
	}
	
	
	// this method will set values for member variables
	public void setBeer(int t) {
		System.out.printf("Enter minimum tempreture for bear %d: ", t+1);
		this.minTemp = sc.nextFloat();
		System.out.printf("Enter maximum tempreture for bear %d: ", t+1);
		this.maxTemp = sc.nextFloat();
		System.out.println();
	}
	
}
