package tempMonitor;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;
// this class is comparing my input to desired temperature and printing my output in console accordingly

public class printingOutput {
	
	// this method will check weather my temperature is in desired temperature range or not 
	public static boolean[] checkTemprature(int j, Vector<Float> input, float min[], float max[]) {
		boolean stable[] = new boolean[5];
		for(int i=0; i<5; i++) {
			if(input.get(j*5+i) <= max[i] && input.get(j*5+i) >= min[i]) {
				stable[i] = true;	// if in range then true
			} else {
				stable[i] = false; // if not in range then false
			}
		}
		return stable;
	}
	
	
   // this method will print my output
   public void printOutput(int count, Vector<Float> input, float min[], float max[]) {
	   
	   // count/5 is total set of values of container temperatures
	   for(int j=0; j<count/5; j++) {
		   boolean[] status = checkTemprature(j, input, min, max);
		   for(int i=0; i<5; i++) {
			   if(status[i]) {
				   System.out.printf("Container %d is under control and have temperature: %f \n", i+1, input.get(j*5+i));
			   } else {
				   System.out.printf("WARNING Container %d is out of control and have temperature: %f \n", i+1, input.get(j*5+i));
			   }
		   }
		   System.out.println("\n");
		   
		   // to make our program wait for 2 seconds between printing the temperature and reading next temperature 
		   try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}  
	   }
   }
   
}
