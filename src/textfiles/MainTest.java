
/**
 * This is the Junit test case for the project class.
 * @author Coleen Araza
 * @version 1
 */

package textfiles;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testMain() {
		int duration=1;
		int durationin=1;
		int sumofexpense;
		String file= "C:/Users/Dell/Documents/CIE 123/Project/data.txt";			
		assertTrue(ReadFile("123	2015/02/24 15:49:19 1235456	2015/02/25 18:47:19 1	2015/02/25 18:47:25 3	2015/02/26 22:01:40 3	2015/02/26 22:17:59 "));
		//assertTrue(Main(1235595));
	}

	private boolean ReadFile(String string) {
		// TODO Auto-generated method stub
		return true;
	}
}
	
	//private Object Main(int i) {
		// TODO Auto-generated method stub
		//return sumofexpense;
	//}


