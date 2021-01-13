package tempMonitor;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class printingOutput {
	
	public static boolean[] checkTemprature(int j, Vector<Float> input, float min[], float max[]) {
		boolean stable[] = new boolean[5];
		for(int i=0; i<5; i++) {
			if(input.get(j*5+i) <= max[i] && input.get(j*5+i) >= min[i]) {
				stable[i] = true;
			} else {
				stable[i] = false;
			}
		}
		return stable;
	}
	
   public void printOutput(int count, Vector<Float> input, float min[], float max[]) {
	 //boolean status[] = new boolean[5];
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
		   try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}  
	   }
   }
   
}
