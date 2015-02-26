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

	/**
	 * This main function is the one that handles user interaction. It calls the read and write functions as needed by the user.
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date logdate = new Date();
		String dateoflog;
		dateoflog = date.format(logdate);
		int flag = 1;
		while (flag==1)
		{
		// TODO Auto-generated method stub
		String choice;
		String duration;
		Scanner choicein = new Scanner (System.in);
		Scanner durationin = new Scanner (System.in);
		System.out.println("What do you want to do? (enter 1 or 2. Enter exit to exit the program.)");
		System.out.println("1.Read expense log");
		System.out.println("2. Input expense");
		choice = choicein.nextLine();
		
		if (choice.equals("1")) //This initiates file reading
		{String file_name;
		
		Scanner userinput = new Scanner (System.in);
		System.out.print("Please enter file to open: ");
		file_name =  userinput.nextLine();
		System.out.println("Please choose range of expense log data to display (enter 1, 2, 3, or 4)");
		System.out.println("1. Month");
		System.out.println("2. Week");
		System.out.println("3. Day");
		System.out.println("4. All");
		duration = durationin.nextLine();
		try {
			ReadFile file =  new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			String numberholder="";
			String temp="";
			int sumofexpense=0;
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			
		//	System.out.println( aryLines[ i ] ) ;
			
			temp=aryLines[i];
			//start code for monthly sum
			if (duration.equals("1"))	
				/**
				 * this part of the code handles the display of the monthly expenses
				 */
			{
			//start of loop for sum
			for(int x=0; x<temp.length(); x++)
			{
			if (temp.charAt(x)=='\t')//insert string comparison function here. If the character in the string is equal to a tab, then for arylines i to 0, store to an int value
			{
				if (temp.contains(dateoflog.substring(0,7)))
				{	
					System.out.println( aryLines[ i ] ) ;
				for (int j=0; j<x; j++)
					{//insert function for storing the int into a variable
					numberholder += temp.charAt(j);
					
					}
				sumofexpense += Integer.parseInt(numberholder);
				numberholder="";
				}
				else {}
				}
			}
			//end of loop for sum
			}// end of code for monthly sum
			
			//start code for weekly sum
			if (duration.equals("2"))
				/**
				 * This part of the code handles the display of the weekly expense as well as the total expense for the week
				 */
			{
			//start of loop for sum
				for(int x=0; x<temp.length(); x++)
				{
				if (temp.charAt(x)=='\t')//insert string comparison function here. If the character in the string is equal to a tab, then for arylines i to 0, store to an int value
				{
					
					if (Integer.parseInt(temp.substring(x+9,x+11))>=Integer.parseInt(dateoflog.substring(8,10))-3 && Integer.parseInt(temp.substring(x+9,x+11))<=Integer.parseInt(dateoflog.substring(8,10))+3 )
					{	
						System.out.println( aryLines[ i ] ) ;
					for (int j=0; j<x; j++)
						{//insert function for storing the int into a variable
						numberholder += temp.charAt(j);
						
						}
					sumofexpense += Integer.parseInt(numberholder);
					numberholder="";
					}
					else {}
					}
				}
			//end of loop for sum
			}// end of code for weekly sum
			
			//start code for daily sum
			if (duration.equals("3"))	
				/**
				 * this part of the code handles the display of expenses for the day
				 */
			{
			//start of loop for sum
				for(int x=0; x<temp.length(); x++)
				{
				if (temp.charAt(x)=='\t')//insert string comparison function here. If the character in the string is equal to a tab, then for arylines i to 0, store to an int value
				{
					if (temp.contains(dateoflog.substring(0,10)))
					{	
						System.out.println( aryLines[ i ] ) ;
					for (int j=0; j<x; j++)
						{//insert function for storing the int into a variable
						numberholder += temp.charAt(j);
						
						}
					sumofexpense += Integer.parseInt(numberholder);
					numberholder="";
					}
					else {}
					}
				}
			//end of loop for sum
			}// end of code for daily sum
			
			//start code for all sum
			if (duration.equals("4"))	
				/**
				 * this part of the code handles the display of all expense logs
				 */
			{
			//start of loop for sum
				System.out.println( aryLines[ i ] ) ;
				for(int x=0; x<temp.length(); x++)
				{
				if (temp.charAt(x)=='\t')//insert string comparison function here. If the character in the string is equal to a tab, then for arylines i to 0, store to an int value
				{
						
					for (int j=0; j<x; j++)
						{//insert function for storing the int into a variable
						numberholder += temp.charAt(j);
						
						}
					sumofexpense += Integer.parseInt(numberholder);
					numberholder="";
					
					
					}
				}
			//end of loop for sum
			}// end of code for all sum
			}
			
			
			System.out.println("Total amount spent: " + sumofexpense);
			
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
		int number = Integer.parseInt(userinput.nextLine().replaceAll("[^\\d]", "").replaceAll("\\s+",""));
		logvalue=String.valueOf(number);
		//this is where the date code was
		data.writeToFile(logvalue+"\t"+dateoflog);
		
		System.out.println("The amount recorded is : " + logvalue + " has been written on the file.");}
		
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
