package tempMonitor;


import java.io.*; 
import java.util.*;

public class firstClass extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Temperature Monitor");
		
		float bearTempMin[] = new float[5];
		float bearTempMax[] = new float[5];
		
		bearTempMax[0] = (float) 6.0; bearTempMin[0] = (float) 4.0;
	    bearTempMax[1] = (float) 6.0; bearTempMin[1] = (float) 5.0;
	    bearTempMax[2] = (float) 7.0; bearTempMin[2] = (float) 4.0;
	    bearTempMax[3] = (float) 8.0; bearTempMin[3] = (float) 6.0;
	    bearTempMax[4] = (float) 5.0; bearTempMin[4] = (float) 3.0;
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
	   for(int j=0; j<count/5; j++) {
		   for(int i=0; i<5; i++) {
			   if(input.get(j*5+i) <= bearTempMax[i] && input.get(j*5+i) >= bearTempMin[i]) {
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
