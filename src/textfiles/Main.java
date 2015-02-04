/**
 * 
 */
package textfiles;

import java.io.IOException;
import java.util.Scanner;

import textfiles.FileData;
import textfiles.writetofile;
import textfiles.ReadFile;

/**
 * @author Carlo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String choice;
		Scanner choicein = new Scanner (System.in);
		System.out.println("What do you want to do? (enter 1 or 2)");
		System.out.println("1.Read expense log");
		System.out.println("2. Input expense");
		choice = choicein.nextLine();
		
		if (choice.equals("1")) //This initiates file reading
		{String file_name;
		
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
		}}
		
		else if (choice.equals("2"))//this initiates file writing
		{String file_name;
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter file to write to");
		file_name = userinput.nextLine();
		
		writetofile data= new writetofile(file_name, true);
		
		data.writeToFile("This is a test run.");
		
		System.out.println("Text has been written on the file.");}
		//else
		//{System.out.println("Invalid input. Please try again.");}
		

	}

}
