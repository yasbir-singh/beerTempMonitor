package tempMonitor;

import java.io.*; 
import java.util.*;

public class firstClass extends Thread {
	
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

	public static void main(String[] args) {
		
		System.out.println("Welcome to Temperature Monitor");
		
		float beerTempMin[] = new float[5];
		float beerTempMax[] = new float[5];
		
		beerTempMax[0] = (float) 6.0; beerTempMin[0] = (float) 4.0;
	    beerTempMax[1] = (float) 6.0; beerTempMin[1] = (float) 5.0;
	    beerTempMax[2] = (float) 7.0; beerTempMin[2] = (float) 4.0;
	    beerTempMax[3] = (float) 8.0; beerTempMin[3] = (float) 6.0;
	    beerTempMax[4] = (float) 5.0; beerTempMin[4] = (float) 3.0;
	    Vector<Float> input = new Vector<Float>(5);
	    int count=0;
	    
	    //System.out.println(System.getProperty("user.dir"));
	    File myfile = new File("data1.txt");
	    
	    try {
            Scanner sc = new Scanner(myfile);    //Scanner
            sc.useLocale(Locale.US);
             while(sc.hasNext()) {
            	 input.add(sc.nextFloat());
            	 count++;
             }
            // Closing the file
            sc.close();

       } catch (IOException e) {
    	   System.out.println("File not found.");
       }
	   
	   //boolean status[] = new boolean[5];
	   for(int j=0; j<count/5; j++) {
		   boolean[] status = checkTemprature(j, input, beerTempMin, beerTempMax);
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
