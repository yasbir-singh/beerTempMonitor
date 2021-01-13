package tempMonitor;

import java.util.Scanner;

public class beerType {
	Scanner sc= new Scanner(System.in);
	float minTemp, maxTemp;
	
	beerType(){
		this.minTemp = 0;
		this.maxTemp = 0;
	}
	
	public void setBeer(int t) {
		System.out.printf("Enter minimum tempreture for bear %d: ", t+1);
		this.minTemp = sc.nextFloat();
		System.out.println();
		System.out.printf("Enter maximum tempreture for bear %d: ", t+1);
		this.maxTemp = sc.nextFloat();
	}
	
}
