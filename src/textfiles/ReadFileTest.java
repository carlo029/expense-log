/**
 * @author Coleen Araza
 * This is the Junit test case for the Readfile class.
 * @version 1
 */

package textfiles;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ReadFileTest {

	private String path;
	
	@Test
	public void testReadFile() {
		path= "C:/Users/Dell/Documents/CIE 123/Project/data.txt"; 
		assertTrue( ReadFile("C:/Users/Dell/Documents/CIE 123/Project/data.txt"));
	}

	private Object ReadFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void assertTrue(Object readFile) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testOpenFile() throws IOException {
		FileReader fr = new FileReader("C:/Users/Dell/Documents/CIE 123/Project/data.txt");
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = 6;
		String[ ] textData = new String[numberOfLines];
		
		int i;

		for (i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine();

		}
		
		textReader.close( );
		
		assertTrue(OpenFile("This is a test run.This is a test run.This is a test run.This is a test run.This is a test run.Hello"));
	}

	private Object OpenFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testReadLines() throws IOException {
		FileReader file_to_read =  new FileReader("C:/Users/Dell/Documents/CIE 123/Project/data.txt");
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines=0;
		
		while ((aLine=bf.readLine()) !=null){
			numberOfLines++;
		}
		
		bf.close();
		
		assertTrue(ReadLines(6));
	}

	private Object ReadLines(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
