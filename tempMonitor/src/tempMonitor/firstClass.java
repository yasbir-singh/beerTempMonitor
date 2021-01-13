package tempMonitor;

import java.io.*; 
import java.util.*;

public class firstClass extends Thread {
	
	public static void main(String[] args) {
		
		// this is scanner
		Scanner scc= new Scanner(System.in);
		System.out.println("Welcome to Temperature Monitor");
		System.out.println("How many different types of beer the truck will carry?:  ");
		int n = scc.nextInt();
		
		
		// take minimum and max temperature of every beer
		// setBeer function set the values for beer[i] object
		beerType beer[] = new beerType[n];
		
		for(int i=0; i<n; i++) {
			beer[i] = new beerType();
			beer[i].setBeer(i);
		}
		float min[] = new float[n];
		float max[] = new float[n];
		for(int i=0; i<n; i++) {
			min[i] = beer[i].minTemp;
			max[i] = beer[i].maxTemp;
		}
		
		// assuming we put each type of beer in different container
		
		inputData data = new inputData();
		data.readFromFile();
		
		printingOutput output = new printingOutput();
		output.printOutput(data.count, data.vctr, min, max);
	}
}
