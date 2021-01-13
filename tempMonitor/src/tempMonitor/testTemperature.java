package tempMonitor;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Vector;

import org.junit.Test;

public class testTemperature {

	@Test
	public void test() {
		
		firstClass test = new firstClass();
		Vector<Float> input = new Vector<Float>(5);
		input.add((float)5.6);
		input.add((float)5.33);
		input.add((float)5.6);
		input.add((float)7.0);
		input.add((float)4.33);
		
		float beerTempMin[] = new float[5];
		float beerTempMax[] = new float[5];
		
		beerTempMax[0] = (float) 6.0; beerTempMin[0] = (float) 4.0;
	    beerTempMax[1] = (float) 6.0; beerTempMin[1] = (float) 5.0;
	    beerTempMax[2] = (float) 7.0; beerTempMin[2] = (float) 4.0;
	    beerTempMax[3] = (float) 8.0; beerTempMin[3] = (float) 6.0;
	    beerTempMax[4] = (float) 5.0; beerTempMin[4] = (float) 3.0;
		
		boolean[] output = test.checkTemprature(0, input, beerTempMin, beerTempMax);
		boolean ans[] = new boolean[5];
		ans[0] = true;
		ans[1] = true;
		ans[2] = true;
		ans[3] = true;
		ans[4] = true;
		assertTrue(Arrays.equals(ans, output));
	}

}
