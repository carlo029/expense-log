
/**
 * This is the Junit test case for the writetofile class.
 * @author Coleen Araza
 * @version 1
 */


package textfiles;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class writetofileTest {

	private String path;
	
	private boolean append_to_file= true;
	
	@Test
	public void testWritetofileString() {
		/*path= "C:/Users/Dell/Documents/CIE 123/Project/data.txt"; 
		assertTrue( writetofile("C:/Users/Dell/Documents/CIE 123/Project/data.txt"));*/
		path= "D:/My Files/5th year 2nd sem/CIE123/project/data.txt"; 
		assertTrue( writetofile("D:/My Files/5th year 2nd sem/CIE123/project/data.txt"));
		
	}

	private void assertTrue(Object writetofile) {
	}

	@Test
	public void testWritetofileStringBoolean() {
		/*path= "C:/Users/Dell/Documents/CIE 123/Project/data.txt"; 
		assertTrue( writetofile("C:/Users/Dell/Documents/CIE 123/Project/data.txt"));
		append_to_file= true; 
		assertTrue( writetofile("C:/Users/Dell/Documents/CIE 123/Project/data.txt"));*/
		path= "D:/My Files/5th year 2nd sem/CIE123/project/data.txt"; 
		assertTrue( writetofile("D:/My Files/5th year 2nd sem/CIE123/project/data.txt"));
		append_to_file= true; 
		assertTrue( writetofile("D:/My Files/5th year 2nd sem/CIE123/project/data.txt"));
	}

	private Object writetofile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testWriteToFile() throws IOException {
		/*FileWriter write = new FileWriter("C:/Users/Dell/Documents/CIE 123/Project/data.txt", true);
		PrintWriter print_line= new PrintWriter(write);
		print_line.printf("%s" + "%n", "Hello");
		 
		 print_line.close();
		assertTrue(writeToFile("Hello"));*/
		
		FileWriter write = new FileWriter("D:/My Files/5th year 2nd sem/CIE123/project/data.txt", true);
		PrintWriter print_line= new PrintWriter(write);
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date logdate = new Date();
		String dateoflog;
		dateoflog = date.format(logdate);
		for (int i=0; i<1000; i++) //this will write 100 lines to the text file
		{
		print_line.printf("%s" + "%n",  " This is a stress test line. iteration " + i + "  " + dateoflog);
		}
		 
		 print_line.close();
		assertTrue(writeToFile("Hello"));
		
	}

	private Object writeToFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
