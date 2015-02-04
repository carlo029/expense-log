/**
 * 
 */
package textfiles;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import textfiles.FileData;
import textfiles.writetofile;
import textfiles.ReadFile;

/**
 * @author Carlo
 *
 */
public class Main {

	/**This main function is the one that handles user interaction. It calls the read and write functions as needed by the user.
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int flag = 1;
		while (flag==1)
		{
		// TODO Auto-generated method stub
		String choice;
		Scanner choicein = new Scanner (System.in);
		System.out.println("What do you want to do? (enter 1 or 2. Enter exit to exit the program.)");
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
		System.out.println("Enter value to write to text file.");
		String logvalue;
		int number = Integer.parseInt(userinput.nextLine().replaceAll("[^\\d]", ""));
		logvalue=String.valueOf(number);
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date logdate = new Date();
		String dateoflog;
		dateoflog = date.format(logdate);
		data.writeToFile(logvalue+"\t"+dateoflog);
		
		System.out.println("The string: " + logvalue + " has been written on the file.");}
		
		else if (choice.equals("exit"))
		{
			System.out.println("Program will not exit...");
			flag=0;
		}
		else
		{System.out.println("Invalid input. Please try again.");}
		

	}
	}

}
