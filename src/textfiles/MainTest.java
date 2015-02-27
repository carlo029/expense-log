

package textfiles;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Test;
/**
 * This is the Junit test case for the project class.
 * @author Coleen Araza
 * @version 1
 */
public class MainTest {	
	/**
	 * This will check the main function. Changed System.in and out to constants. Output are assertTrue functions.
	 */
 void testMain() throws IOException {
	
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date logdate = new Date();
		String dateoflog;
		dateoflog = date.format(logdate);
		int flag = 1;
		while (flag==1)
		{
		// TODO Auto-generated method stub
		String choice="1";
		java.lang.String duration="1";
		String fileuser= "C:/Users/Dell/Documents/CIE 123/Project/data.txt";			
		Scanner choicein = new Scanner (fileuser);
		Scanner durationin = new Scanner (fileuser);
		choice = choicein.nextLine();
		
		if (choice.equals("1")) //This initiates file reading
		{String file_name;
		
		Scanner userinput = new Scanner (System.in);
		file_name =  userinput.nextLine();
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
					String ( aryLines[ i ] ) ;
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
						String ( aryLines[ i ] ) ;
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
			{
			//start of loop for sum
				for(int x=0; x<temp.length(); x++)
				{
				if (temp.charAt(x)=='\t')//insert string comparison function here. If the character in the string is equal to a tab, then for arylines i to 0, store to an int value
				{
					if (temp.contains(dateoflog.substring(0,10)))
					{	
						String ( aryLines[ i ] ) ;
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
			assertTrue(sumofexpense==123586);
			}	
		catch (IOException e) {
		}}
		
		else if (choice.equals("2"))//this initiates file writing
		{String file_name;
		String amount= "67";
		Scanner userinput = new Scanner(amount);
		file_name = userinput.nextLine();
		
		writetofile data= new writetofile(file_name, true);
		String logvalue;
		int number = Integer.parseInt(userinput.nextLine().replaceAll("[^\\d]", "").replaceAll("\\s+",""));
		logvalue=String.valueOf(number);
		//this is where the date code was
		data.writeToFile(logvalue+"\t"+dateoflog);
		
		assertTrue(writeToFile(logvalue+"\t"+dateoflog));}
		
		else if (choice.equals("exit"))
		{
			flag=0;
		}		
	}
}

	private boolean writeToFile(java.lang.String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private void String(String string) {
		// TODO Auto-generated method stub
		
	}
}


