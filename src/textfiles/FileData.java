/**
 * This class opens a text file in a specified directory and then outputs the lines of the text file to the java console
 * @author Carlo Antioquia
 * @version 1
 * Reference: http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html
 */




package textfiles;
import java.io.IOException;
import java.util.Scanner;

//used http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html as reference for this code

public class FileData {
	public static void main (String args[]) throws IOException{
	/**
	 * This determines the directory of the file and outputs the lines of the text file
	 * @throws IOException
	 */
		
		String file_name;
		
		Scanner userinput = new Scanner (System.in);
		System.out.print("Please enter file to open: ");
		file_name =  userinput.nextLine();
		
		try {
			ReadFile file =  new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			System.out.println( aryLines[ i ] ) ;
			}
			
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
