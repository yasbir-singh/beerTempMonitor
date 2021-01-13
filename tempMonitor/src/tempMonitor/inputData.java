package tempMonitor;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class inputData {
	Scanner scc= new Scanner(System.in);
	// vector to store the inputs from the file data1
    Vector<Float> vctr = new Vector<Float>(5);
    int count=0;
    
    
    public void readFromFile() {
    	// "data1" contains some values when containers are 5
    	File myfile = new File("data1.txt");
    	
    	try {
            Scanner sc = new Scanner(myfile);    //Scanner
            sc.useLocale(Locale.US);
             while(sc.hasNext()) {
            	 this.vctr.add(sc.nextFloat());
            	 this.count++;
             }
            // Closing the file
            sc.close();

       } catch (IOException e) {
    	   System.out.println("File not found.");
       }
    }
    
    public void inputFromUser(int t) {
    	System.out.printf("Enter temprature of each container manually starting from 1st: ");
    	for(int i=0; i<t; i++) {
    		this.vctr.add(scc.nextFloat());
    	}
    	this.count = t;
    }
    
}
