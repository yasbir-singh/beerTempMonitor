package tempMonitor;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Vector;

import org.junit.Test;

// this class will test my checkTemprature method in class printingOuput

// i am testing for just one case where 2nd container will report low temperature form minimum
// and 5th will report higher then maximum temperature
public class testTemperature {

	@Test
	public void test() {
		
		printingOutput test = new printingOutput();
		Vector<Float> input = new Vector<Float>(5);
		input.add((float)5.6);
		input.add((float)1.33);
		input.add((float)5.6);
		input.add((float)7.0);
		input.add((float)4.33);
		
		float beerTempMin[] = new float[5];
		float beerTempMax[] = new float[5];
		
		beerTempMax[0] = (float) 6.0; beerTempMin[0] = (float) 4.0;
	    beerTempMax[1] = (float) 6.0; beerTempMin[1] = (float) 5.0;
	    beerTempMax[2] = (float) 7.0; beerTempMin[2] = (float) 4.0;
	    beerTempMax[3] = (float) 8.0; beerTempMin[3] = (float) 6.0;
	    beerTempMax[4] = (float) 5.0; beerTempMin[4] = (float) 8.30;
		
		boolean[] output = test.checkTemprature(0, input, beerTempMin, beerTempMax);
		boolean ans[] = new boolean[5];
		ans[0] = true;
		ans[1] = false;     // i put my expected result of 2nd container to false
		ans[2] = true;
		ans[3] = true;
		ans[4] = false;		//  false for 5th container
		assertTrue(Arrays.equals(ans, output));
	}

}
