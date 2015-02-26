
package textfiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * This class writes text on a specific file. New text lines are appended to the text file.
 * @author Coleen Araza
 * @version 1
 * Source: http://www.homeandlearn.co.uk/java/write_to_textfile.html
 */
public class writetofile {
	/**
	 * This determines the file name and location.
	 */
	private String path;
	/**
	 * This allows the appending of the new text line. If false, the previous file written will be deleted. The new text line will be created.
	 */
	private boolean append_to_file= true;
	/**
	 * This determines the file location and name.
	 * @param string file_path
	 * @return path
	 */
	public writetofile(String file_path){
		path=file_path;
	}
	/**
	 * A file is specified where the new text line will be appended.
	 * @ param String file_path and authorization for appending
	 * @return append value
	 */
	public writetofile(String file_path, boolean append_value){
		path= file_path;
		append_to_file= append_value;
	}
	/**
	 * writeToFile handles the appending to a text document. It will receive the file name and location and the append value to use to append text.
	 * FileWriter uses bytes but PrintWriter can output readable text. %s describes a string of characters while %n  means a new line.
	 * @param textline
	 * @return text on file
	 * @throws IOException
	 */
	
	public void writeToFile(String textLine) throws IOException {
		
		FileWriter write = new FileWriter(path, append_to_file);
		PrintWriter print_line= new PrintWriter(write);
		 print_line.printf("%s" + "%n", textLine);
		 
		 print_line.close();
		
	}
	/**
	 * @ This is a text main
	 */
	
	/*public static void main(String[] args) throws IOException {
		String file_name;
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter file to write to");
		file_name = userinput.nextLine();
		
		writetofile data= new writetofile(file_name, true);
		
		data.writeToFile("This is a test run.");
		
		System.out.println("Text has been written on the file.");	

	}*/

}

